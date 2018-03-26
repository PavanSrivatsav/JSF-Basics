package com.pavansrivatsav.jsf.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String country;

	public Student() {
	}

	/** Getters and Setters **/

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
