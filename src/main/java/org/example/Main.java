package org.example;

import org.example.repository.LibraryRepository;
import org.example.service.LibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        LibraryManager libraryManager = context.getBean(LibraryManager.class);
        LibraryRepository libraryRepository = context.getBean(LibraryRepository.class);

        Book book = new Book();
        book.setTitle("Java");
        book.setAuthor("Eldar");
        book.setId(1);


        libraryRepository.addBook(book);

        libraryManager.showAllBooks();


    }
}