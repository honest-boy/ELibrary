package com.booklib.bean;

public class BookBean {
private String callno,name,author,publisher;
private int quantity;
private String issued;
public BookBean() {
	super();
	// TODO Auto-generated constructor stub
}
public BookBean(String callno, String name, String author, String publisher, int quantity, String issued) {
	super();
	this.callno = callno;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.quantity = quantity;
	this.issued = issued;
}
public String getCallno() {
	return callno;
}
public void setCallno(String callno) {
	this.callno = callno;
}
public String getName() {
	return name;
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
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getIssued() {
	return issued;
}
public void setIssued(String issued) {
	this.issued = issued;
}

}
