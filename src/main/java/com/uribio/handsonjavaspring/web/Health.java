package com.uribio.handsonjavaspring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Health {
  @RequestMapping(value="/health", method={GET, POST})
  public String index() {
    return "OK";
  }
}
