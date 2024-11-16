package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

  @GetMapping("/")
  public String index(){

    return "index";
  }

  @GetMapping("/getArr")
  public String[] getArr(){

    return new String[]{"AAA","BBB","CCC"};
  }
}
