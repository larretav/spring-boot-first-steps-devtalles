package com.devtalles.tu_cv_spring_boot.cv.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class CvApiController {

  @GetMapping("/person")
  public Person getPerson() {
    return new Person("Pepe", "Perez", "Desarrollador");
  }

}
