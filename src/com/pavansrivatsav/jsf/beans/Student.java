package com.pavansrivatsav.jsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String country;
	private List<String> countries;
	private String favProgLang;
	private List<String> favProgLanguages;
	private String[] commLang;
	private Integer number;
	private String phoneNo;

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

	public void validateCode(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		if (value == null) { // not validating if value is null
			return;
		}

		String data = value.toString(); // conv to string

		if (!data.startsWith("PAV")) {
			FacesMessage msg = new FacesMessage("Code Shld start with PAV");
			throw new ValidatorException(msg);
		}
	}

	/** Getters and Setters **/

	public List<String> getCountries() {
		return countries;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setCommLang(String[] commLang) {
		this.commLang = commLang;
	}

	public String[] getCommLang() {
		return commLang;
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
