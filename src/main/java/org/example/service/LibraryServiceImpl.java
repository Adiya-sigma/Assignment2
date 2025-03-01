package org.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class LibraryServiceImpl implements LibraryService {


    @Override
    public String getServiceType() {
        return "Primary Library Service";
    }
}
