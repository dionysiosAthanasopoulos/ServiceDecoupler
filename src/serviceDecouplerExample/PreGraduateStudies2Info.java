package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class PreGraduateStudies2Info {

	//Variables.
	int id;
	double grade;
	String supervisor;
	String[] committeeMembers;


	//Constructor.
	PreGraduateStudies2Info( int id, double grade, String supervisor, String[] committeeMembers ){

		this.id = id;
		this.grade = grade;
		this.supervisor = supervisor;
		this.committeeMembers = committeeMembers;
	}
}
