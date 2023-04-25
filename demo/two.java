package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class two {
	private String Name;
	private int id;
	@JsonIgnore private long Age;
	private String Email;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAge() {
		return Age;
	}
	public void setAge(long age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "two [Name=" + Name + ", id=" + id + ", Age=" + Age + ", Email=" + Email + "]";
	}
	

}
