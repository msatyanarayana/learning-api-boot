package com.satya.learning.controller;

import com.satya.learning.dtos.StudentRequest;
import com.satya.learning.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class SampleController {

    @Autowired
    private SampleService sampleService;
    @GetMapping("/getData")
    public String getData(@RequestParam String id){
        return sampleService.getData(id);
    }

    @PostMapping("/setData")
    public String setData(@RequestBody StudentRequest studentRequest){
        return sampleService.setData(studentRequest);
    }
}
