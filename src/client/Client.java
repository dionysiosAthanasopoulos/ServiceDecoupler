package client;

import serviceAbstraction.AbstractService;
import serviceAbstraction.ConcreteServiceID;
import serviceAbstraction.MappedFieldsFactory;
import serviceAdapter.DataType1;
import serviceAdapter.ServiceAdapter;
import serviceDecoupler.MappedFields;
import serviceDecoupler.MappedFieldsFacade;
import serviceDecoupler.ServiceInterfaceFacade;
import serviceDecoupler.UnmappedFields1;
import serviceDecoupler.UnmappedFields2;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class Client {

	public static void main(String[] args) throws Exception {

		System.out.println( "---- Facade started. ----" );

		ServiceInterfaceFacade sf = new ServiceInterfaceFacade();


		MappedFields sfields = new MappedFields();
		sfields.x = 5;

		UnmappedFields1 e1 = new UnmappedFields1();
		e1.y = 6;

		UnmappedFields2 e2 = new UnmappedFields2();
		e2.z = 7;


		sf.mappedOperation( new MappedFieldsFacade( sfields, e1 , e2 ) );

		sf.unmappedOperation1();

		System.out.println( "---- Facade ended. ----" );


		MappedFieldsFactory dt = new MappedFieldsFactory( sfields );

		AbstractService sa = new AbstractService( new ConcreteServiceID() );

		sa.mappedOperation( dt );


		ServiceAdapter adapter = new ServiceAdapter( null );

		adapter.operation1( new DataType1() );
	}
}
