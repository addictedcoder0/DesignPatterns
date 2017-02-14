package com.pattern.specific.TransferObjectPattern;

public class StudentVO {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	private int rollNo;
	public StudentVO(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	
}
