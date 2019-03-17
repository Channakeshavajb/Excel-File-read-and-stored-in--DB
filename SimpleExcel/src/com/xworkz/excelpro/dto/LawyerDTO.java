package com.xworkz.excelpro.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Lawyer_details")
public class LawyerDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="lawyers",strategy="increment")
	@GeneratedValue(generator="lawyers")
	@Column(name="L_Id")
	private int id;
	@Column(name="L_Name")
	private String name;
	@Column(name="L_Experience")
	private double exp;
	@Column(name="L_specialist")
	private String specialist;
	@Column(name="L_PhoneNo")
	private double phoneNo;
	@Column(name="L_Address")
	private String address;
	
	public LawyerDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("created \t"+this.getClass().getSimpleName());
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public double getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "LawyerDTO [id=" + id + ", name=" + name + ", exp=" + exp + ", specialist=" + specialist + ", phoneNo="
				+ phoneNo + ", address=" + address + "]";
	}
	
	

}
