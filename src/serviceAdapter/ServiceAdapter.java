package serviceAdapter;

import serviceAbstraction.ConcreteServiceID;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class ServiceAdapter {

	//Variables.
	private Mappings mappings;


	//Constructor.
	public ServiceAdapter( ConcreteServiceID concreteServiceInterfaceID ){

	}


	//Methods.
	public void operation1( DataType1 dt ){

		ConcreteService1 si1 = new ConcreteService1();

		si1.operation1( new DataType1() );

		ConcreteService2 si = new ConcreteService2();

		si.operation2( new DataType2() );
	}
}
