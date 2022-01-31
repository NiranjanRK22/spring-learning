package com.studentapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bistudent")
public class BiStudent {
	@Column(length=20)
    private String name;
    @Id
    @Column(name="studentid")
    @GeneratedValue(generator="bistud_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="bistud_seq", sequenceName="bistudent_seq", initialValue=1, allocationSize=1)
    private Integer studentId;
    @Column(length=20)
    private String department;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="addressid") //to give a different column name
    private BiAddress address;
	/**
	 * 
	 */
	public BiStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param department
	 * @param address
	 */
	public BiStudent(String name, String department, BiAddress address) {
		super();
		this.name = name;
		this.department = department;
		this.address = address;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the studentId
	 */
	public Integer getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the address
	 */
	public BiAddress getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(BiAddress address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "BiStudent [name=" + name + ", studentId=" + studentId + ", department=" + department + ", address="
				+ address + "]";
	}
	
    
	
}
