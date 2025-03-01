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
        book.setTitle("The Best Book");
        book.setAuthor("Adiya");
        book.setId(1);
        Book book2 = new Book();
        book2.setTitle("The not Best Book");
        book2.setAuthor("Nurzhan");
        book2.setId(2);

        libraryRepository.addBook(book);
        libraryRepository.addBook(book2);

        libraryManager.showAllBooks();


    }
}