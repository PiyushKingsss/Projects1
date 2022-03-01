package com.reddy.bean;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	private int rollNumber;
	private String name;
	private float percentage;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	

}
