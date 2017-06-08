package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class ServiceInterfaceFacade {

	public MappedFieldsFacade mappedOperation( MappedFieldsFacade input ){

		MappedFieldsFacade result = null;

		try{

			MappedDataTypeFields dt1 = input.getCurrentDataTypeFactory();

			ServiceInterface si1 = new ServiceInterface1Adapter();

			MappedDataTypeFields resultSimilarDataTypeFields = si1.mappedOperation( dt1 );

			result = new MappedFieldsFacade( resultSimilarDataTypeFields.getMappedFields(), ((DataType1Factory) resultSimilarDataTypeFields).getUnmappedFields(), null );
		}

		catch( Exception e ){

			System.err.println( "\n\t[ServiceInterfaceFacade]: Exception caught, I will call operation2 of ConcreteService2.\n" );


			for( int i = 0; i < input.getSubstituteServicesNum(); ++i ){

				MappedDataTypeFields dt2 = input.getSubstituteDataTypeFactory( i );

				ServiceInterface si2 = new ServiceInterface2Adapter();

				try {

					MappedDataTypeFields resultSimilarDataTypeFields = si2.mappedOperation( dt2 );

					result = new MappedFieldsFacade( resultSimilarDataTypeFields.getMappedFields(), null, ((DataType2Factory) resultSimilarDataTypeFields).getExtraFields() );

					break;

				} catch( Exception e1 ){

					System.out.println( "\n\t[ServiceInterfaceFacade]: Exception caught, I will call operation of the next substitute service.\n" );
				}
			}
		}


		return result;
	}

	public void unmappedOperation1(){

		ServiceInterface1Adapter si = new ServiceInterface1Adapter();

		si.unmappedOperation1();
	}

	public void unmappedOperation2(){

		ServiceInterface2Adapter si = new ServiceInterface2Adapter();

		si.extraOperation2();
	}
}
