package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class ConcreteService1 {

	public DataType1 operation1( DataType1 dt1 ) throws Exception{

		System.out.println( "\n\toperation1( " + dt1.x + ", " + dt1.y + " ) of ConcreteService1 was invoked: Fault!\n" );


		throw new Exception();
	}

	public void unmappedOperation1(){

		System.out.println( "\n\textraOperation1 of ConcreteService1 was invoked.\n" );
	}
}
