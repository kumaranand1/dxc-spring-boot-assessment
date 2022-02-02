package com.assessment.demoperson.DataValidation;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;


public class Persondatavalidation {
	@NotEmpty
	private String name;

    @NotEmpty
    private String Email;

    @NotEmpty
    private String address;

	private LocalDate Dob;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public String getEmail() {
		return this.Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}
    public String getaddress() {
		return this.address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public void setDob(String Dob) {
		this.Dob = LocalDate.parse(Dob);
	}
	
	public String getDob() {
		return Dob.toString();
	}

	public String toString() {
		return "Person(Name: " + this.name + ",Dob:" + this.Dob + ", Email: " + this.Email +",address: " + this.address +")";
	}
}
