package com.spring.model;

import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.spring.validation.VertyCode;

public class Student {

	@NotNull(message = "Required")
	@NotEmpty(message = "Required")
	@Size(min = 3, message = "firstName Must Be At Least 3 Charcters")
	private String fName;
	
	@NotNull(message = "Required")
	@NotEmpty(message="Required")
	@Size(min=3, message="Last Name Must Be At Least 3 Characters")
	private String lName;
	
	@NotNull(message = "Required")
	@Min(value = 20, message = "Age Must Be Greater Than OR Equal 20")
	@Max(value = 60, message=" Age Must Be Less Than OR Equal 60")
	private String age;
		
	@NotNull(message="Required")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid Email")
	private String email;
	
	@NotNull(message="Required")
	private Integer code;
	
	@NotNull(message="Required")
	@VertyCode
	private String indexCountry;
	
	private String country;
	private HashMap<String, String> countryOptions;
	
	private String lang;
	
	private String[] players;
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
	public String[] getPlayers() {
		return players;
	}
	public void setPlayers(String[] players) {
		this.players = players;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getIndexCountry() {
		return indexCountry;
	}
	public void setIndexCountry(String indexCountry) {
		this.indexCountry = indexCountry;
	}
	
	
	
	
	
	
}
