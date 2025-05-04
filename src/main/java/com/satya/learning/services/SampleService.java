package com.satya.learning.services;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public String getData(String id) {
        return id+" satya";
    }
}
