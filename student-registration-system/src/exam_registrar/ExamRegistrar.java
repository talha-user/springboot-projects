package exam_registrar;

import exam.Exam;
import paper.Paper;
import student.Student;

public class ExamRegistrar {
	private ExamRegistrar(){ }
	public static ExamRegistrar getExamRegistrar(){
	return new ExamRegistrar();
	}
	
	public Exam registeringStudentForExamination (Student student){
		Paper paper=new Paper();
		Exam exam=new Exam(paper);
		return exam;
	}


}
