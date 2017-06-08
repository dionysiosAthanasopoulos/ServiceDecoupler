package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class PreGraduateStudies1InfoFactory extends MappedStudiesInfoFields {

	//Variables.
	private PreGraduateStudies1InfoUnmappedFields uf;


	//Constructor.
	PreGraduateStudies1InfoFactory( MappedFields mf, PreGraduateStudies1InfoUnmappedFields uf ){

		super( mf );

		this.uf = uf;
	}


	//Methods.
	PreGraduateStudies1Info makeObject(){

		PreGraduateStudies1Info dt = new PreGraduateStudies1Info( mf.id, mf.grade, mf.advisor );


		return dt;
	}

	//Getters.
	PreGraduateStudies1InfoUnmappedFields getUnmappedFields(){

		return uf;
	}
}
