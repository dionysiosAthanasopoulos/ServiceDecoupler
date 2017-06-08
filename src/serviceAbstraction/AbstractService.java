package serviceAbstraction;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class AbstractService {

	//Variables.
	private ServiceInterfaceMappings mappings;


	//Constructor.
	public AbstractService( ConcreteServiceID concreteServiceInterfaceID ){


	}


	//Methods.
	public void mappedOperation( MappedFieldsFactory mt ){

		ConcreteService1 si = new ConcreteService1();

		si.operation1( mt.makeObject1() );
	}
}
