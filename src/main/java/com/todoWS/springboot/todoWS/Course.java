package com.todoWS.springboot.todoWS;

import java.util.Date;

public class Course {
	private long id;
	private String  name;
	private String author;
	private Date datepubbl;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Date getDatepubbl() {
		return datepubbl;
	}
	public void setDatepubbl(Date datepubbl) {
		this.datepubbl = datepubbl;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Course() {
		super();
	}
	
	public Course(long id, String name, String author) { 
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.datepubbl = new Date();
	}
	public String toString() {
		return "[id]:" +this.id +", [name]:" + this.name + "[author]:" + this.author +" [Date]: " +this.datepubbl;
	}
	
	
}
