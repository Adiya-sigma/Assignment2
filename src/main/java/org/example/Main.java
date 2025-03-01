package org.example;

import org.example.repository.LibraryRepository;
import org.example.service.LibraryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ReportGenerator reportGenerator = context.getBean(ReportGenerator.class);
        reportGenerator.generateReport();
        reportGenerator.readReport();
        context.close();


    }
}