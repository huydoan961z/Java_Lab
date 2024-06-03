/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro192.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }
 public void loadBooksFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int bookID = Integer.parseInt(parts[0].trim());
                String title = parts[1].trim();
                String author = parts[2].trim();
                int yearPublished = Integer.parseInt(parts[3].trim());
                Book book = new Book(bookID, title, author, yearPublished);
                bookList.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Book> searchBooksByTitle(String title) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public List<Book> searchBooksByAuthor(String author) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public List<Book> searchBooksByYear(int year) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getYearPublished() == year) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void printBookList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
