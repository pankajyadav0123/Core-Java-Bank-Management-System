package com.library.management;

import java.util.ArrayList;
import java.util.List;

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
        System.out.println();
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("You have borrowed " + title);
                return;
            }
        }
        System.out.println("Sorry, " + title + " is not available for borrowing.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isAvailable()) {
                book.setAvailable(true);
                System.out.println("You have returned " + title);
                return;
            }
        }
        System.out.println("Invalid book or it is already returned.");
    }
}