package com.devtalles.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
@RequestMapping("/cv")
public class CvController {

  @GetMapping("")
  public String index() {
    return "index";
  }

  @GetMapping("/pepe")
  public String pepe() {
    return "pepe";
  }

}
