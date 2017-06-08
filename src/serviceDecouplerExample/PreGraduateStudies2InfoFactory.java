package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class PreGraduateStudies2InfoFactory extends MappedStudiesInfoFields {

	//Variables.
	private PreGraduateStudies2InfoMappedFields ef;


	//Constructor.
	PreGraduateStudies2InfoFactory( MappedFields sf, PreGraduateStudies2InfoMappedFields ef ){

		super( sf );

		this.ef = ef;
	}


	//Methods.
	PreGraduateStudies2Info makeObject(){

		PreGraduateStudies2Info dt = new PreGraduateStudies2Info( mf.id, mf.grade, mf.advisor, ef.committeeMembers );


		return dt;
	}

	//Getters.
	PreGraduateStudies2InfoMappedFields getExtraFields(){

		return ef;
	}
}
