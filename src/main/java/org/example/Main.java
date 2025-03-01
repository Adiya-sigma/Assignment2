package org.example;

import org.example.service.LibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        LibraryService libraryService = context.getBean(LibraryService.class);
        System.out.println("Library Service: " + libraryService);

        LibraryManager libraryManager = context.getBean(LibraryManager.class);
        ReportGenerator reportGenerator = context.getBean(ReportGenerator.class);

    }
}