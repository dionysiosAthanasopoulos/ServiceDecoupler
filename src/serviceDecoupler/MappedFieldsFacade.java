package serviceDecoupler;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class MappedFieldsFacade {

	//Variables.
	private MappedFields mf;
	private UnmappedFields1 uf1;
	private UnmappedFields2 uf2;
	private int substituteServicesNum;


	//Constructors.
	public MappedFieldsFacade( MappedFields mf, UnmappedFields1 uf1, UnmappedFields2 uf2 ){

		if( mf == null || (mf != null && ( uf1 == null && uf2 == null ) ) ){

			System.err.println( "\n\n[SimilarDataTypeFieldsFacade]: You should provide values for mapped and unmapped data-type fields of at least one service." );

			System.exit( -1 );
		}

		else{

			if( uf2 != null ) ++substituteServicesNum;
		}


		this.mf = mf;

		this.uf1 = uf1;

		this.uf2 = uf2;
	}


	//Methods.
	int getSubstituteServicesNum(){

		return substituteServicesNum;
	}

	MappedDataTypeFields getCurrentDataTypeFactory(){

		MappedDataTypeFields dt1 = new DataType1Factory( mf, uf1 );


		return dt1;
	}

	MappedDataTypeFields getSubstituteDataTypeFactory( int i ){

		MappedDataTypeFields dt2 = null;

		if( i == 0 ) dt2 = new DataType2Factory( mf, uf2 );

		else System.err.println( "\n\n[MappedDataTypeFieldsFacade]: Unkwnon substitute service." );


		return dt2;
	}
}
