package org.example.repository;

import org.example.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class LibraryRepositoryImpl implements LibraryRepository {
    private final Map<Integer, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }
    @Override
    public Book getBook(int id) {
        return books.get(id);
    }
    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

}
