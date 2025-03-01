package org.example.repository;

import org.example.Book;

import java.util.List;

public interface LibraryRepository {
    void addBook(Book book);
    Book getBook(int id);
    List<Book> getAllBooks();
}
