package com.devtalles.tu_cv_spring_boot.cv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class SkillsController {

  @GetMapping("/skills")
  public String index(Model model) {
    // var skills = List.of("Java", "Spring", "React", "Nextjs", "HTML", "CSS", "JavaScript");
    var skills = List.of();
    model.addAttribute("skills", skills);
    return "skills";
  }

}
