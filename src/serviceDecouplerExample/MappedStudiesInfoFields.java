package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
abstract class MappedStudiesInfoFields {

	//Variables.
	protected MappedFields mf;


	//Constructor.
	MappedStudiesInfoFields( MappedFields mf ){

		this.mf = mf;
	}

	//Getters.
	MappedFields getMappedFields(){

		return mf;
	}
}
