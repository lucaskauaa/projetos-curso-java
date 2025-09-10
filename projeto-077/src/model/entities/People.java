package model.entities;

import java.time.LocalDate;

public class People implements Comparable<People> {

	private String name;
	private Integer age;
	
	public People() {
	}

	public People(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public int compareTo(People other) {
		return age.compareTo(other.age);
	}
}
