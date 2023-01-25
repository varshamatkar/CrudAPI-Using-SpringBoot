package com.simple.api.operation.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Address {
	@Id
    @Column(name="address_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int address_id;
    
   
    @Column(name="Street")
    @NotBlank(message = "street is mandatory")
	@Size(min=3,max =20)
    
    private String street;
    
    @Column(name="City")
    @NotBlank(message = "City is mandatory")
	@Size(min=3,max =20)
    private String city;
    
    @Column(name="State")
    @NotBlank(message = "State is mandatory")
    @Size(min=3,max =20)
    private String state;
    
    @NotBlank(message = "PinCode is mandatory")
    @Column(name="PinCode")
    @Size(min=6,max =6)
    @NotNull
    private String pinCode;
    
    
    public Address() {
		super();
	}


	
	public Address(int address_id, String street, String city, String state, String pinCode) {
		super();
		this.address_id = address_id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}



	public int getAddress_id() {
		return address_id;
	}



	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getPinCode() {
		return pinCode;
	}



	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}



	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", pinCode=" + pinCode + "]";
	}
    
    
}


