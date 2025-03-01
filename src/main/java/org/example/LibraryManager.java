package org.example;

import org.example.repository.LibraryRepositoryImpl;
import org.springframework.stereotype.Component;

@Component
public class LibraryManager {
    private final LibraryRepositoryImpl libraryRepositoryImpl;

    public LibraryManager(LibraryRepositoryImpl libraryRepositoryImpl) {
        System.out.println("LibraryManager created");
        this.libraryRepositoryImpl = libraryRepositoryImpl;
    }
    public void showAllBooks() {
        System.out.println("List of Books in Library Manager: ");

        LibraryRepositoryImpl libraryRepository;
        for (Book book : libraryRepositoryImpl.getAllBooks()) {
            System.out.println(book);
        }
    }
}
