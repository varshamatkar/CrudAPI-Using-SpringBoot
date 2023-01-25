package com.simple.api.operation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Student {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="StudentId")
    private int studentId;
	
	

	@NotBlank(message = "EmployeeName is mandatory")
	@Size(min=3,max =20)
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
    
	@Column(unique=true ,length=20)
	@Email(message ="Email should be valid")
	@NotNull
    private String email_Id;
    
	
    
    @OneToOne(cascade=CascadeType.ALL)
    private Address address;

	
	public Student() {
		super();
	}


	public Student(int studentId, @NotBlank(message = "EmployeeName is mandatory") @Size(min = 3, max = 20) String firstName,
			String lastName, @Email(message = "Email should be valid") @NotNull String email_Id, Address address) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email_Id = email_Id;
		this.address = address;
	}


	public int getstudentId() {
		return studentId;
	}


	public void setId(int studentId) {
		this.studentId =studentId;
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


	public String getEmail_Id() {
		return email_Id;
	}


	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email_Id=" + email_Id
				+ ", address=" + address + "]";
	}

}
	
	
