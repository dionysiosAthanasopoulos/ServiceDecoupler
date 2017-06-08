package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class StudentEnrolmentServiceInterfaceFacade {

	public MappedStudiesInfoFieldsFacade addStudiesInfo( MappedStudiesInfoFieldsFacade input ){

		MappedStudiesInfoFieldsFacade result = null;

		try{

			MappedStudiesInfoFields dt1 = input.getCurrentDataTypeFactory();

			StudentEnrolmentServiceInterface si1 = new PreGraduateStudentEnrolment1Adapter();

			MappedStudiesInfoFields resultSimilarDataTypeFields = si1.addStudiesInfo( dt1 );

			result = new MappedStudiesInfoFieldsFacade( resultSimilarDataTypeFields.getMappedFields(), ((PreGraduateStudies1InfoFactory) resultSimilarDataTypeFields).getUnmappedFields(), null );
		}

		catch( Exception e ){

			System.err.println( "\n\t[ServiceInterfaceFacade]: Exception caught, I will call addStudiesInfo of PreGraduateStudentEnrolment.\n" );


			for( int i = 0; i < input.getSubstituteServicesNum(); ++i ){

				MappedStudiesInfoFields dt2 = input.getSubstituteDataTypeFactory( i );

				StudentEnrolmentServiceInterface si2 = new PreGraduateStudentEnrolment2Adapter();

				try {

					MappedStudiesInfoFields resultSimilarDataTypeFields = si2.addStudiesInfo( dt2 );

					result = new MappedStudiesInfoFieldsFacade( resultSimilarDataTypeFields.getMappedFields(), null, ((PreGraduateStudies2InfoFactory) resultSimilarDataTypeFields).getExtraFields() );

					break;

				} catch( Exception e1 ){

					System.out.println( "\n\t[ServiceInterfaceFacade]: Exception caught, I will call operation of the next substitute service.\n" );
				}
			}
		}


		return result;
	}
}
