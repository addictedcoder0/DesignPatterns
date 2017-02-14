package com.pattern.specific.DataAccessObjectPattern;

public class DaoPatternDemo {

	public static void main(String[] args)
	{
		StudentDAO studentDAO = new StudentDAOImpl();
		
		//print all students 
		for(Student student : studentDAO.getAllStudents())
		{
			System.out.println("Student : [RollNo :"+student.getRollNo() + " , Name : "+student.getName()+" ]");
		}
		//update student
		Student student = studentDAO.getAllStudents().get(0);
		student.setName("mandrin");
		studentDAO.updateStudent(student);
		
		studentDAO.getStudent(0);
		System.out.println("Student : [ RollNo : "+student.getRollNo()+" , Name : "+student.getName()+" ] ");
	}
}
