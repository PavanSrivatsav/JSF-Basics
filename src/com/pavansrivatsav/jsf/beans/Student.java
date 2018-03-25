package com.pavansrivatsav.jsf.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	public String firstName;
	public String lastName;

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

}
