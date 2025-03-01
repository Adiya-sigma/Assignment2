package org.example.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("alternativeLibraryService")
public class LibraryServiceAlt implements LibraryService {
    @Override
    public String getServiceType() {
        return "alternativeLibraryService";
    }
}
