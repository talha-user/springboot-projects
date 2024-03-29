package student;

import exam.Exam;
import exam_registrar.ExamRegistrar;
import paper.Paper;
import registrar.Registrar;

public class Student {

	String Name;
	String Marital_Status;
	int Age;
	String Gender;
	String Date_of_Birth ;
	String Address;
	String Primary_Email_id; 
	String Secondary_Email_id;
	String Phone_Number;
	String Interested_Subject;
	String Highest_Education_Qualification;
	String Nationality;
	public Double admissionId;
	String result;
	Exam exam;

	public Student(String name, String marital_Status, int age, String gender, String date_of_Birth, String address,
			String primary_Email_id, String secondary_Email_id, String phone_Number, String interested_Subject,
			String highest_Education_Qualification, String nationality, Double admissionId, String result, Exam exam) {
		super();
		Name = name;
		Marital_Status = marital_Status;
		Age = age;
		Gender = gender;
		Date_of_Birth = date_of_Birth;
		Address = address;
		Primary_Email_id = primary_Email_id;
		Secondary_Email_id = secondary_Email_id;
		Phone_Number = phone_Number;
		Interested_Subject = interested_Subject;
		Highest_Education_Qualification = highest_Education_Qualification;
		Nationality = nationality;
		this.admissionId = admissionId;
		this.result = result;
		this.exam = exam;
	}
	
	public void registerStudent() {
		 Registrar registrar=Registrar.getRegistrar();
		admissionId = registrar.registerStudent(this);
		System.out.println(admissionId);
		 }
	public void registerForExam(){
		ExamRegistrar examRegistrar=ExamRegistrar.getExamRegistrar();
		exam=examRegistrar. registeringStudentForExamination(this);
		}
	public void appearForExam(){
		Paper paper=exam.getPaper();
		result=paper.submit();
		}

}
