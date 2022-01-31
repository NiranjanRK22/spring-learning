package com.employeeapp.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
	@Column(name="employeeid")
	@GeneratedValue(generator="emp_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="emp_seq", sequenceName="employee_seq", initialValue=1, allocationSize=1)
    private Integer employeeId;
	@Column(name="employeename", length=20)
    private String employeeName;
	@Column(name="birthdate")
    private LocalDate birthDate;
    private double salary;
    @Column(name="bloodgroup", length=10)
    private String bloodGroup;
    @Column(length=20)
    private String role;
    private int experience;
    private int mobileNumber;
    @Column(name="mailid", length=30)
    private String mailId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="houseid")
    private Address address;
    
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param employeeName
	 * @param birthDate
	 * @param salary
	 * @param bloodGroup
	 * @param role
	 * @param experience
	 * @param mobileNumber
	 * @param mailId
	 * @param address
	 */
	public Employee(String employeeName, LocalDate birthDate, double salary, String bloodGroup, String role,
			int experience, int mobileNumber, String mailId, Address address) {
		super();
		this.employeeName = employeeName;
		this.birthDate = birthDate;
		this.salary = salary;
		this.bloodGroup = bloodGroup;
		this.role = role;
		this.experience = experience;
		this.mobileNumber = mobileNumber;
		this.mailId = mailId;
		this.address = address;
	}

	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}

	/**
	 * @return the mobileNumber
	 */
	public int getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the mailId
	 */
	public String getMailId() {
		return mailId;
	}

	/**
	 * @param mailId the mailId to set
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", birthDate=" + birthDate
				+ ", salary=" + salary + ", bloodGroup=" + bloodGroup + ", role=" + role + ", experience=" + experience
				+ ", mobileNumber=" + mobileNumber + ", mailId=" + mailId + ", address=" + address + "]";
	}
    
	
    
}
