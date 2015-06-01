package com.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String uid;
	private String name;
	private int phn_no;
	private String gender;
	private String address;
	private String email;
	private String pancardno;
	private int adhaarcardno;
	private int experience;
	private Date doj;
	private Date dob;
	
	public Employee()
	{
		
	}
	
	public Employee(String uid, String name, int phn_no, String gender, String address,
			String email, String pancardno, int adhaarcardno, int experience,
			Date doj, Date dob) 
	{
		super();
		this.uid=uid;
		this.name = name;
		this.phn_no = phn_no;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.pancardno = pancardno;
		this.adhaarcardno = adhaarcardno;
		this.experience = experience;
		this.doj = doj;
		this.dob = dob;
	}

	
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhn_no() {
		return phn_no;
	}

	public void setPhn_no(int phn_no) {
		this.phn_no = phn_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPancardno() {
		return pancardno;
	}

	public void setPancardno(String pancardno) {
		this.pancardno = pancardno;
	}

	public int getAdhaarcardno() {
		return adhaarcardno;
	}

	public void setAdhaarcardno(int adhaarcardno) {
		this.adhaarcardno = adhaarcardno;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}
