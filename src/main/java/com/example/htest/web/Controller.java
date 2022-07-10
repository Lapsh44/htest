package com.example.htest.web;


import com.example.htest.RestGetService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller  {
 @Autowired
    RestGetService restGetService;

    @GetMapping("/hels")
    public String hels() throws Exception {
        restGetService.chk();
        restGetService.chk2();
        return "OK" ;

    }
}