package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class PreGraduateStudentEnrolment1Adapter implements StudentEnrolmentServiceInterface {

	public MappedStudiesInfoFields addStudiesInfo( MappedStudiesInfoFields dt ) throws Exception{

		PreGraduateStudies1Info dt1 = ((PreGraduateStudies1InfoFactory) dt).makeObject();


		PreGraduateStudentEnrolment1 si1 = new PreGraduateStudentEnrolment1();

		si1.addStudiesInfo( dt1 );


		return dt;
	}
}
