package com.book;

public class Book {
	
	private String name;
    private String author;
    private String category;
    private boolean isTaken;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isTaken() {
		return isTaken;
	}
	public void setTaken(boolean isTaken) {
		this.isTaken = isTaken;
	}
	public Book(String name, String author, String category, boolean isTaken) {
		super();
		this.name = name;
		this.author = author;
		this.category = category;
		this.isTaken = false;
	}
	public Book() {
		super();
		
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", category=" + category + ", isTaken=" + isTaken + "]";
	}
	public Object getTakenBy() {
		// TODO Auto-generated method stub
		return null;
	}
    

}
