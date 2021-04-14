package com.cg.jpaproject2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private int id;
   @Column(name="ISBN")
   private int isbn;
   @Column(name="title")
   private String bookname;
   @Column(name="price")
   private double price;
   @ManyToMany(targetEntity=Author.class)
   private List<Author> authorlist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Author> getAuthorlist() {
		return authorlist;
	}
	public void setAuthorlist(List<Author> authorlist) {
		this.authorlist = authorlist;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", bookname=" + bookname + ", price=" + price + ", authorlist="
				+ authorlist + "]";
	}
   	
}
