package com.example.SpringBootDeepAssign3Appplication;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Passenger {
	private int PassengerId;
	private String FirstName;
	private String LastName;
	private String Address;
	private String City;
	private String Country;
	private String Telephone;
	private String Email;
	
	@JsonCreator
	public Passenger(
			@JsonProperty("PassengerId") int PassengerId, 
			@JsonProperty("FirstName") String FirstName, 
			@JsonProperty("LastName") String LastName, 
			@JsonProperty("Address") String Address, 
			@JsonProperty("City") String City, 
			@JsonProperty("Country") String Country, 
			@JsonProperty("Telephone") String Telephone, 
			@JsonProperty("Email") String Email) {
		this.PassengerId = PassengerId;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Address = Address;
		this.City = City;
		this.Country = Country;
		this.Telephone = Telephone;
		this.Email = Email;
	}
	public void setPassengerId(int value) {
		this.PassengerId = value;
	}
	public int getPassengerId() {
		return PassengerId;
	}
	
	public void setFirstName(String value) {
		this.FirstName = value;
	}
	public String getFirstName() {
		return FirstName;
	}
	
	public void setLastName(String value) {
		this.LastName = value;
	}
	public String getLastName() {
		return LastName;
	}
	
	public void setAddress(String value) {
		this.Address = value;
	}
	public String getAddress() {
		return Address;
	}
	
	public void setCity(String value) {
		this.City = value;
	}
	public String getCity() {
		return City;
	}
	
	public void setCountry(String value) {
		this.Country = value;
	}
	public String getCountry() {
		return Country;
	}
	
	public void setTelephone(String value) {
		this.Telephone = value;
	}
	public String getTelephone() {
		return Telephone;
	}
	
	public void setEmail(String value) {
		this.Email = value;
	}
	public String getEmail() {
		return Email;
	}
}
