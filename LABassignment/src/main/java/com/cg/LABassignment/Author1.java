package com.cg.LABassignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Autr")
public class Author1 {
	@Id
	@Column(name="idno")
	private int idno;
	@Column(name="fname")
    private String firstName;
	@Column(name="mname")
    private String middleName;
	@Column(name="lname")
    private String lastName;
	@Column(name="phn")
    private long phoneno;
	public Author1() {
		super();
		
	}
	public Author1(int idno,String firstName, String middleName, String lastName, long phoneno) {
		super();
		this.idno=idno;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneno = phoneno;
	}
	
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Author id="+idno+"firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", phoneno="
				+ phoneno ;
	}
	
	
	
}
