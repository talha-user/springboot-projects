package validator;

import student.Student;

public class Validator {
	 private Validator(){
	 }
	public static Validator getValidator() {
	 return new Validator();
	}
	public boolean validateStudentDetails(Student student){
		 System.out.println("Validated");
		return true;
	}

}
