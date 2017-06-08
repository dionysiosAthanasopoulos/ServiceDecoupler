package serviceAbstraction;

import serviceDecoupler.MappedFields;

/**
*
* @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
*
*/
public class MappedFieldsFactory {

	//Variables.
	private MappedFields mf;
	private DataTypeMappings mappings;


	//Constructor.
	public MappedFieldsFactory( MappedFields mf ){

		this.mf = mf;
	}


	//Getter.
	DataType1 makeObject1(){

		return new DataType1();
	}
}
