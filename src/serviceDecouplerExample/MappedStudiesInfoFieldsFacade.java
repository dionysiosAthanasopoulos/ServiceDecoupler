package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class MappedStudiesInfoFieldsFacade {

	//Variables.
	private MappedFields mf;
	private PreGraduateStudies1InfoUnmappedFields uf1;
	private PreGraduateStudies2InfoMappedFields uf2;
	private int substituteServicesNum;


	//Constructors.
	public MappedStudiesInfoFieldsFacade( MappedFields mf, PreGraduateStudies1InfoUnmappedFields uf1, PreGraduateStudies2InfoMappedFields uf2 ){

		if( mf == null || (mf != null && ( uf1 == null && uf2 == null ) ) ){

			System.err.println( "\n\n[SimilarDataTypeFieldsFacade]: You should provide values for mapped and unmapped data-type fields of at least one service." );

			System.exit( -1 );
		}

		else{

			if( uf2 != null ) ++substituteServicesNum;
		}


		this.mf = mf;

		this.uf1 = uf1;

		this.uf2 = uf2;
	}


	//Methods.
	int getSubstituteServicesNum(){

		return substituteServicesNum;
	}

	MappedStudiesInfoFields getCurrentDataTypeFactory(){

		MappedStudiesInfoFields dt1 = new PreGraduateStudies1InfoFactory( mf, uf1 );


		return dt1;
	}

	MappedStudiesInfoFields getSubstituteDataTypeFactory( int i ){

		MappedStudiesInfoFields dt2 = null;

		if( i == 0 ) dt2 = new PreGraduateStudies2InfoFactory( mf, uf2 );

		else System.err.println( "\n\n[MappedDataTypeFieldsFacade]: Unkwnon substitute service." );


		return dt2;
	}
}
