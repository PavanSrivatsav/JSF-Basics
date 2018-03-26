package com.pavansrivatsav.jsf.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Tour {

	public Tour() {

	}

	private String typeOfTour;

	public String getTypeOfTour() {
		return typeOfTour;
	}

	public void setTypeOfTour(String typeOfTour) {
		this.typeOfTour = typeOfTour;
	}

	public String redirectionOfPage() {
		if (typeOfTour != null && typeOfTour == "City") {
			return "city_tour";
		} else {
			return "country_tour";
		}
	}

}
