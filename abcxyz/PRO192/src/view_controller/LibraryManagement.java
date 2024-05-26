/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view_controller;

import pro192.model.Book;
import java.util.List;
import java.util.Scanner;
import pro192.model.Library;

public class LibraryManagement {
    private Library library;

    public LibraryManagement() {
        library = new Library();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAllBooks();
                    break;
                case 2:
                    bookSearchMenu();
                    break;
                case 3:
                    addNewBook();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }

    private void displayMenu() {
        System.out.println("===== Library Management =====");
        System.out.println("1. Display all books");
        System.out.println("2. Book search");
        System.out.println("3. Add new book");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private void displayAllBooks() {
        List<Book> bookList = library.getBookList();
        if (bookList.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("===== All Books =====");
            library.printBookList(bookList);
        }
    }

    private void bookSearchMenu() {
        Scanner scanner = new Scanner(System.in);
        int searchChoice;

        do {
            displaySearchMenu();
            searchChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (searchChoice) {
                case 1:
                    searchByTitle();
                    break;
                case 2:
                    searchByAuthor();
                    break;
                case 3:
                    searchByYear();
                    break;
                case 4:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (searchChoice != 4);
    }

    private void displaySearchMenu() {
        System.out.println("===== Book Search =====");
        System.out.println("1. Search by title");
        System.out.println("2. Search by author");
        System.out.println("3. Search by year");
        System.out.println("4. Return to main menu");
        System.out.print("Enter your choice: ");
    }

    private void searchByTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title to search for: ");
        String title = scanner.nextLine();
        List<Book> searchResults = library.searchBooksByTitle(title);
        if (searchResults.isEmpty()) {
            System.out.println("No books found with the given title.");
        } else {
            System.out.println("===== Search Results =====");
            library.printBookList(searchResults);
        }
    }

    private void searchByAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author to search for: ");
        String author = scanner.nextLine();
        List<Book> searchResults = library.searchBooksByAuthor(author);
        if (searchResults.isEmpty()) {
            System.out.println("No books found by the given author.");
        } else {
            System.out.println("===== Search Results =====");
            library.printBookList(searchResults);
        }
    }

    private void searchByYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year to search for: ");
        int year = scanner.nextInt();
        List<Book> searchResults = library.searchBooksByYear(year);
        if (searchResults.isEmpty()) {
            System.out.println("No books found published in the given year.");
        } else {
            System.out.println("===== Search Results =====");
            library.printBookList(searchResults);
        }
    }

    private void addNewBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the book ID: ");
        int bookID = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the author: ");
        String author = scanner.nextLine();
        System.out.print("Enter the year published: ");
        int yearPublished = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Book newBook = new Book(bookID, title, author, yearPublished);
        library.addBook(newBook);
        System.out.println("Book added successfully.");
    }

    public static void main(String[] args) {
        LibraryManagement app = new LibraryManagement();
        app.run();
    }
}
