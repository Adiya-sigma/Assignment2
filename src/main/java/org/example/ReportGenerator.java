package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ReportGenerator {
    public ReportGenerator() {
        System.out.println("Report Generator");
    }
}
