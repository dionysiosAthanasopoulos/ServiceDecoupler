package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class DataType1Factory extends MappedDataTypeFields {

	//Variables.
	private UnmappedFields1 uf;


	//Constructor.
	DataType1Factory( MappedFields mf, UnmappedFields1 uf ){

		super( mf );

		this.uf = uf;
	}


	//Methods.
	DataType1 makeObject(){

		DataType1 dt = new DataType1( mf.x, uf.y );


		return dt;
	}

	//Getters.
	UnmappedFields1 getUnmappedFields(){

		return uf;
	}
}
