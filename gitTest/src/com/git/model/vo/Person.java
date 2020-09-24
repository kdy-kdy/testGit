package com.git.model.vo;

import java.util.Arrays;

public class Person {
	private String name;
	private int age;
	private double height;
	private String[] hobby;
	private String address;

	public Person() {
		// TODO Auto-generated constructor stub
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", hobby=" + Arrays.toString(hobby)
				+ ", address=" + address + "]";
	}
}
