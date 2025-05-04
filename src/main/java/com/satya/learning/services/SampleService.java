package com.satya.learning.services;

import com.satya.learning.dtos.StudentRequest;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public String getData(String id) {
        return id.concat("first deployment");
    }

    public String setData(StudentRequest studentRequest) {
        return "Hi " + studentRequest.getName() + " your id is " + studentRequest.getId();
    }
}
