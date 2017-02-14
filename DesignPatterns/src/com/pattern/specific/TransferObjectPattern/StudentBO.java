package com.pattern.specific.TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

	//List is working as DB
	List<StudentVO> students ;
	public StudentBO()
	{
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("dev",0);
		StudentVO student2 = new StudentVO("ronny",1);
		students.add(student1);
		students.add(student2);
	}
	public void deleteStudent(StudentVO student)
	{
		students.remove(student.getRollNo());
		System.out.println("Student : Roll No "+student.getRollNo()+" , deleted from the database");
	}
	//retrieve list of students from the database
	public List<StudentVO> getAllStudents()
	{
		return students;
	}
	public StudentVO getStudent(int rollNo){
		return students.get(rollNo);
	}
	public void updateStudent(StudentVO student)
	{
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student : RollNo "+student.getRollNo()+" , updated in DB");
	}
	
}
