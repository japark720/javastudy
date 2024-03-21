package chapter5.classpart2;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName = "HONG";
		
		System.out.println(student.getStudentName());
		
	}
}