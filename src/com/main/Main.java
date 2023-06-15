package com.main;
import java.util.List;
import java.util.Map;
import com.book.Book;
import com.library.Library;
import com.user.User;

public class Main {

	public static void main(String[] args) {

		// Create a library instance
		Library library = new Library();

		// Add some users
		User user1 = new User("Steve Ditko", "stive@example.com", "password", 6);
		User user2 = new User("Stiven Smit", "stiven@example.com", "password", 12);
		library.addUser(user1);
		library.addUser(user2);

		// Add some books
		library.addBookToLibrary("Harry Potter", "J.K. Rowling", "Category 1");
		library.addBookToLibrary("Spider man", "Stan Lee", "Category 2");

		// Test the APIs
		List<User> allUsers = library.getAllUsers();
		List<Book> booksByCategory = library.getBooksByCategory("Category 1");
		List<Book> availableBooks = library.getBooksByStatus(false);
		User loggedInUser = library.loginUser("john@example.com", "password");
		library.takeBook(loggedInUser, booksByCategory.get(0));
		Map<String, Double> mostReadCategories = library.getMostReadCategories();

		// Print the results
		System.out.println("All Users: " + allUsers);
		System.out.println("Books by Category: " + booksByCategory);
		System.out.println("Available Books: " + availableBooks);
		System.out.println("Logged-in User: " + loggedInUser);
		System.out.println("Most Read Categories: " + mostReadCategories);

	}

}
