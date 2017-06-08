package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class DataType2Factory extends MappedDataTypeFields {

	//Variables.
	private UnmappedFields2 ef;


	//Constructor.
	DataType2Factory( MappedFields sf, UnmappedFields2 ef ){

		super( sf );

		this.ef = ef;
	}


	//Methods.
	DataType2 makeObject(){

		DataType2 dt = new DataType2( mf.x, ef.z );


		return dt;
	}

	//Getters.
	UnmappedFields2 getExtraFields(){

		return ef;
	}
}
