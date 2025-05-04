package com.satya.learning.controller;

import com.satya.learning.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @Autowired
    private SampleService sampleService;
    @GetMapping("/getData")
    public String getData(@RequestParam String id){
        return sampleService.getData(id);
    }
}
