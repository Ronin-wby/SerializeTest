package javatest;

import java.util.ArrayList;
import java.util.List;


public class Demo {
	
	private String name;
	private long ID;
	private int age;
	private String country;
	private List<String> courses = new ArrayList<String>();
	
	public long getID() {
		
		return ID;
	}
	public void setID(long ID) {
		this.ID = ID;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

}
