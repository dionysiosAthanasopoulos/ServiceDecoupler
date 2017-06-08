package serviceDecouplerExample;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class PreGraduateStudentEnrolment1 {

	PreGraduateStudies1Info addStudiesInfo( PreGraduateStudies1Info dt1 ) throws Exception{

		System.out.println( "\n\taddStudiesInfo( " + dt1.id + ", " + dt1.grade + ", " + dt1.advisor + " ) of PreGraduateStudentEnrolment was invoked: Fault!\n" );


		throw new Exception();
	}
}
