package com.p;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="Detail")
	private int id;

	@Column(name="StudentName", length=100)
	private String name;
	private long mobile;
	@Column(name="StudentEmail" , nullable=false,unique=true)
	private String email;
	public Student(String name, long mobile, String email) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}