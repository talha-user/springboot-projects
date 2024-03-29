package registrar;



import student.Student;
import validator.Validator;

public class Registrar {
	private Registrar(){
		 
	}
	public static Registrar getRegistrar(){
	return new Registrar();
	}
	public Double registerStudent(Student student){
		 Validator validator=Validator.getValidator();
		if(validator.validateStudentDetails (student))
		{
		 //generate admission id and return it to the student
		 return student.admissionId;
		}
		return null;
		}
	}



