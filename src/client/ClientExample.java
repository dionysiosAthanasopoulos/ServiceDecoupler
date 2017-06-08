package client;

import serviceDecouplerExample.MappedFields;
import serviceDecouplerExample.MappedStudiesInfoFieldsFacade;
import serviceDecouplerExample.PreGraduateStudies1InfoUnmappedFields;
import serviceDecouplerExample.PreGraduateStudies2InfoMappedFields;
import serviceDecouplerExample.StudentEnrolmentServiceInterfaceFacade;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class ClientExample {

	public static void main(String[] args) throws Exception {

		System.out.println( "---- Facade started. ----" );


		StudentEnrolmentServiceInterfaceFacade f = new StudentEnrolmentServiceInterfaceFacade();


		MappedFields mf = new MappedFields();
		mf.id = 1;
		mf.grade = 90;
		mf.advisor = "Tom";

		PreGraduateStudies2InfoMappedFields uf2 = new PreGraduateStudies2InfoMappedFields();
		uf2.committeeMembers = new String[] { "Joe" };


		f.addStudiesInfo( new MappedStudiesInfoFieldsFacade( mf, new PreGraduateStudies1InfoUnmappedFields(), uf2 ) );


		System.out.println( "---- Facade ended. ----" );
	}
}
