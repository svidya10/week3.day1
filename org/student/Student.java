package org.student;
import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Vidya");
		
	}
	
	public void studentDpt() {
	System.out.println("ECE");
	
	}
	
	public void studentId() {
	System.out.println("A056789");	
	}
	
	public static void main(String[] args) {
		
		Student college = new Student();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		college.deptName();
		college.studentName();
		college.studentDpt();
		college.studentId();
		
		
		
		
	}
}
