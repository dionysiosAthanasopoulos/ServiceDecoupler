package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class ServiceInterface2Adapter implements ServiceInterface {

	public MappedDataTypeFields mappedOperation( MappedDataTypeFields dt ) throws Exception{

		DataType2 dt2 = ((DataType2Factory) dt).makeObject();


		ConcreteService2 si2 = new ConcreteService2();

		si2.operation2( dt2 );


		return dt;
	}

	public void extraOperation2(){

		ConcreteService2 si2 = new ConcreteService2();

		si2.extraOperation2();
	}
}
