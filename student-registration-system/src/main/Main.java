package main;

import exam.Exam;
import paper.Paper;
import student.Student;

public class Main {
   public static void main(String args[]) {
	   Paper paper = new Paper();
	   Exam exam = new Exam(paper);
	   Student student = new Student("Rohan","single",25,"Male","03-March-2000",
			   "Lucknow","abc@gmail.com","def@gmail.com","123456789","Science","Bachelor","Indian",
			   Math.random(),"pass",exam);
	   student.registerStudent();
	   student.registerForExam();
	   student.appearForExam();
	   paper.submit();
   }
}
