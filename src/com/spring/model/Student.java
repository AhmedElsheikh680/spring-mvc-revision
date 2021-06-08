package com.spring.model;

import java.util.HashMap;

public class Student {

	
	private String fName;
	private String lName;
	private String age;
	
	private String country;
	private HashMap<String, String> countryOptions;
	
	private String lang;
	public Student() {
		countryOptions = new HashMap<>();
		countryOptions.put("Egypt", "EG");
		countryOptions.put("Germany", "GE");
		countryOptions.put("Indian", "IN");
		countryOptions.put("Russian", "RU");
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(HashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
	
}
