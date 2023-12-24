package org.tnsif.streamapi;

public class Student {
	private int roll;
	private String name;
	private float per;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public Student(int roll, String name, float per) {
		this.roll = roll;
		this.name = name;
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", per=" + per + "]";
	}
}
