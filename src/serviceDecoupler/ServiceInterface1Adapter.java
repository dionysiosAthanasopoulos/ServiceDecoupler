package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class ServiceInterface1Adapter implements ServiceInterface {

	public MappedDataTypeFields mappedOperation( MappedDataTypeFields dt ) throws Exception{

		DataType1 dt1 = ((DataType1Factory) dt).makeObject();


		ConcreteService1 si1 = new ConcreteService1();

		si1.operation1( dt1 );


		return dt;
	}

	public void unmappedOperation1(){

		ConcreteService1 si1 = new ConcreteService1();

		si1.unmappedOperation1();
	}
}
