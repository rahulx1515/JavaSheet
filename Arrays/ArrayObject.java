class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class ArrayObject {
    public static void main(String[] args) {
        // Step 1: Create an array of 3 Book references
        Book[] books = new Book[3];

        // Step 2: Initialize each element
        books[0] = new Book("Effective Java", "Joshua Bloch");
        books[1] = new Book("Thinking in Java", "Bruce Eckel");
        books[2] = new Book("Clean Code", "Robert C. Martin");

        // Step 3: Print out the titles of all books
        System.out.println("Book Titles:");
        for (Book b : books) {
            System.out.println(b.title);
        }
    }
}

