package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class ConcreteService2 {

	DataType2 operation2( DataType2 dt2 ) throws Exception{

		System.out.println( "\n\toperation2( " + dt2.x + ", " + dt2.z + " ) of ConcreteService2 was invoked: Fault!\n" );


		return dt2;
	}

	void extraOperation2(){

		System.out.println( "\n\textraOperation2 of ConcreteService2 was invoked.\n" );
	}
}
