package com.pattern.specific.DataAccessObjectPattern;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
	// List is working as a DataBase
	List<Student> students;
	
	public StudentDAOImpl()
	{
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert",0);
		Student student2 = new Student("john",1);
		students.add(student1);
		students.add(student2);
	}
// Retrieve List of All the students
	public List<Student> getAllStudents() {
		return students;
	}
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student : Roll Number "+student.getRollNo() +" , updated in the DB");
	}
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student : Roll number "+student.getRollNo()+" deleted from the Record");
	}
}
