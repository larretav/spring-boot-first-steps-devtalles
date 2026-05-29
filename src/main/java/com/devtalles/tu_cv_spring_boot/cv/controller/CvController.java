package com.devtalles.tu_cv_spring_boot.cv.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;

@Controller()
@RequestMapping("/cv")
public class CvController {

  @GetMapping({ "/", "", "/index" })
  public String index(Model model) {
    model.addAttribute("name", "Alejandro");
    var person = new Person("Pe", "Perez", "Desarrollador");
    model.addAttribute("person", person);
    return "index";
  }

}
