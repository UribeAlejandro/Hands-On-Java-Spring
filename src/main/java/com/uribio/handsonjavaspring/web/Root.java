package com.uribio.handsonjavaspring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Root {
  @GetMapping("/")
  public String index() {
    return "Hello World!";
  }
}
