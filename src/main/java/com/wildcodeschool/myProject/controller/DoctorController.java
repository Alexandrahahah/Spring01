package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctor1() {
        return ("Ca fonctionne");
    }
    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctor10() {
        return ("oui tout à fait ça fonctionne");
    }
    @GetMapping("/doctor/13")
    @ResponseBody
    public String doctor13() {
        return ("Je suis d'accord ça fonctionne");
    }

}