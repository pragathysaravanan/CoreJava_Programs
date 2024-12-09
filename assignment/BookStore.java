package com.assignment;

//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
//methods to add and remove books from a collection.

import java.util.Scanner;

class Book {
	private String title;
	private String author;
	private long isbn;

	Book(String title, String author, long isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

}

public class BookStore {
	static Scanner sc = new Scanner(System.in);
	static Book[] book;
	static int count = 0;

	public static void main(String[] args) {

		System.out.println("Enter the number of book to be added: ");
		int maxCount = sc.nextInt();
		book = new Book[maxCount];// object array
		int choice;

		do {

			System.out.println("Enter your option\n1. Add Book\n2. Remove Book\n3. Display Book details\n4. Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addBook();
				break;
			case 2:
				removeBook();
				break;
			case 3:
				displayBook();
				break;
			case 4:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invaild choice");
				break;
			}
		} while (choice != 4);

	}

	static void addBook() {
		if (count >= book.length) {
			System.out.println("Book store full");
			return;
		}
		System.out.println("Book Store");
		System.out.print("Enter the Title of the Book: ");
		String title = sc.next();
		System.out.print("Enter the name of the Author: ");
		String author = sc.next();
		System.out.print("Enter the ISBN[13- digit]: ");
		long isbn = sc.nextLong();
		book[count] = new Book(title, author, isbn);
		count++;
		System.out.println("Books added successfully");
	}

	static void removeBook() {
		if (count == 0) {
			System.out.println("no books to remove");
			return;
		}

		System.out.println("Available books:");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + book[i].getTitle());
		}
		System.out.println("Enter the index to remove book: ");
		int indexCount = sc.nextInt();

		if (indexCount <= 0 && indexCount > count) {
			System.out.println("Invalid Index");
			return;
		}
		for (int i = indexCount - 1;i < count - 1; i++ ) {
			book[i] = book[i+1];
		}
		book[indexCount - 1] = null;
		count--;
		System.out.println("Book removed successfully");
	}

	static void displayBook() {
		if (count == 0) {
			System.out.println("Add book details first");
			return;
		}
		System.out.println("\n------ Book Details -----");
		for (int i = 0; i < count; i++) {
			System.out.println("\nTitle: " + book[i].getTitle() + "\tAuthor: " + book[i].getAuthor() + "\tISBN no.: "
					+ book[i].getIsbn());
					System.out.println();
		}

	}

}
