package serviceDecouplerExample;

import java.util.Arrays;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
class PreGraduateStudentEnrolment2 {

	PreGraduateStudies2Info addStudiesInfo( PreGraduateStudies2Info dt2 ) throws Exception{

		System.out.println( "\n\taddStudiesInfo( " + dt2.id + ", " + dt2.grade + ", " + dt2.supervisor + ", " + Arrays.asList( dt2.committeeMembers ) + " ) of PostGraduateStudentEnrolment was invoked!\n" );


		return dt2;
	}
}
