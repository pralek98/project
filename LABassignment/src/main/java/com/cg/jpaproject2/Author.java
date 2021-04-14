package com.cg.jpaproject2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="ID")
  private int id;
  @Column(name="Name")
  private String fname;
  
  
  @ManyToMany(targetEntity=Book.class)
  private List<Book> booklist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	
	public List<Book> getBooklist() {
		return booklist;
	}
	public void setBooklist(List<Book> booklist) {
		this.booklist = booklist;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", fname=" + fname + ", lname=" ;
	}
	  
	  
}
