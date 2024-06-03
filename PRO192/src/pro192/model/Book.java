/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pro192.model;
public class Book implements Comparable<Book> {
    private int bookID;
    private String title;
    private String author;
    private int yearPublished;

    public Book(int bookID, String title, String author, int yearPublished) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters and setters

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
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

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.yearPublished, other.yearPublished);
    }
}
