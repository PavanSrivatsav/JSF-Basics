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
	private String favProgLang;
	private List<String> favProgLanguages;

	public Student() {

		countries = new ArrayList<String>();
		countries.add("USA");
		countries.add("IND");
		countries.add("UAE");

		favProgLanguages = new ArrayList<String>();
		favProgLanguages.add("JavaScript");
		favProgLanguages.add("Java");
		favProgLanguages.add("Dart");

	}

	/** Getters and Setters **/

	public List<String> getCountries() {
		return countries;
	}

	public String getFavProgLang() {
		return favProgLang;
	}

	public void setFavProgLang(String favProgLang) {
		this.favProgLang = favProgLang;
	}

	public List<String> getFavProgLanguages() {
		return favProgLanguages;
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
