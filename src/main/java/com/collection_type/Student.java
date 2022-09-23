package com.collection_type;

import java.util.List;
import java.util.Set;

public class Student {
private int id;
private String name;
private List<String> address;
private Set<String> phone_number;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
public Set<String> getPhone_number() {
	return phone_number;
}
public void setPhone_number(Set<String> phone_number) {
	this.phone_number = phone_number;
}
public Student(int id, String name, List<String> address, Set<String> phone_number) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.phone_number = phone_number;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
return "Student [id=" + id + ", name=" + name + ", address=" + address + ", phone_number=" + phone_number + "]";
}

}
