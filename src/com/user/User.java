package com.user;

import com.book.Book;

public class User {
	
	private String name;
    private String email;
    private String password;
    private int membershipMonths;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMembershipMonths() {
		return membershipMonths;
	}
	public void setMembershipMonths(int membershipMonths) {
		this.membershipMonths = membershipMonths;
	}
	public User(String name, String email, String password, int membershipMonths) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.membershipMonths = membershipMonths;
	}
	public User() {
		super();
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", membershipMonths="
				+ membershipMonths + "]";
	}
	public Book getCurrentBook() {
		
		return null;
	}
    

}
