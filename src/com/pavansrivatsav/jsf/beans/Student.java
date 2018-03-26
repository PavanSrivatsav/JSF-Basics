package com.pavansrivatsav.jsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String country;
	private List<String> countries;

	public Student() {

		countries = new ArrayList<String>();
		countries.add("USA");
		countries.add("IND");
		countries.add("UAE");

	}

	/** Getters and Setters **/

	public List<String> getCountries() {
		return countries;
	}

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
