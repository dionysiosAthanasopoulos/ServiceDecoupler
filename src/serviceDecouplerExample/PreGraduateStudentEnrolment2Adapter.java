package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class PreGraduateStudentEnrolment2Adapter implements StudentEnrolmentServiceInterface {

	public MappedStudiesInfoFields addStudiesInfo( MappedStudiesInfoFields dt ) throws Exception{

		PreGraduateStudies2Info dt2 = ((PreGraduateStudies2InfoFactory) dt).makeObject();


		PreGraduateStudentEnrolment2 si2 = new PreGraduateStudentEnrolment2();

		si2.addStudiesInfo( dt2 );


		return dt;
	}
}
