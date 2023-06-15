package com.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.book.Book;
import com.user.User;

public class Library {

	private List<User> users;
	private List<Book> books;

	public Library() {
		this.users = new ArrayList<>();
		this.books = new ArrayList<>();
	}

	// API 1: Get list of all users with details
	public List<User> getAllUsers() {
		return users;
	}

	// API 2: Get list of all books with details by category/status/name/author
	public List<Book> getBooksByCategory(String category) {
		List<Book> result = new ArrayList<>();
		for (Book book : books) {
			if (book.getCategory().equalsIgnoreCase(category)) {
				result.add(book);
			}
		}
		return result;
	}

	public List<Book> getBooksByStatus(boolean isTaken) {
		List<Book> result = new ArrayList<>();
		for (Book book : books) {
			if (book.isTaken() == isTaken) {
				result.add(book);
			}
		}
		return result;
	}

	// Other methods for adding, updating, and removing books and users
	// ...


	// API 3: Login user (name, email, password, membership months)
	public User loginUser(String email, String password) {
		for (User user : users) {
			if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null; // User not found
	}

	// API 4: Add book to library
	public void addBookToLibrary(String name, String author, String category) {
		Book book = new Book(name, author, category, false);
		books.add(book);
	}

	// API 5: Update book status once user takes or returns book
	public void updateBookStatus(Book book, boolean isTaken) {
		book.setTaken(isTaken);
	}

	// API 6: Check/Update user membership validity
	public boolean isMembershipValid(User user) {
		return false;
		// Check membership validity based on user's membershipMonths
		// ...
	}

	// API 7: Check user membership and update book status
	public String takeBook(User user, Book book) {
		if (!isMembershipValid(user)) {
			return "Membership expired. Please renew your membership.";
		}

		if (book.isTaken()) {
			return "The book is already taken by another user.";
		}

		updateBookStatus(book, true);
		return "Book successfully taken.";
	}

	// API 8: Get specific user details with books read by that user earlier and
	// current book
	public Map<String, Object> getUserDetails(User user) {
		List<Book> previousBooks = new ArrayList<>();
		for (Book book : books) {
			if (book.isTaken() && book.getTakenBy().equals(user)) {
				previousBooks.add(book);
			}
		}

		Map<String, Object> userDetails = new HashMap<>();
		userDetails.put("user", user);
		userDetails.put("previousBooks", previousBooks);
		userDetails.put("currentBook", user.getCurrentBook());
		return userDetails;
	}

	// API 9: Get details of which category books are read by most users
	public Map<String, Double> getMostReadCategories() {
		Map<String, Integer> categoryCount = new HashMap<>();
		for (User user : users) {
			Book currentBook = user.getCurrentBook();
			if (currentBook != null) {
				String category = currentBook.getCategory();
				categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
			}
		}

		int totalUsers = users.size();
		Map<String, Double> categoryPercentage = new HashMap<>();
		for (Map.Entry<String, Integer> entry : categoryCount.entrySet()) {
			String category = entry.getKey();
			int count = entry.getValue();
			double percentage = (count / (double) totalUsers) * 100;
			categoryPercentage.put(category, percentage);
		}

		return categoryPercentage;

	}

	public void addUser(User user1) {
		
		
	}
}
