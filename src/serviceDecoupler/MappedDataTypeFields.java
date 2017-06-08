package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
abstract class MappedDataTypeFields {

	//Variables.
	protected MappedFields mf;


	//Constructor.
	MappedDataTypeFields( MappedFields mf ){

		this.mf = mf;
	}

	//Getters.
	MappedFields getMappedFields(){

		return mf;
	}
}
