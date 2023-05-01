package com.hassan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfuly built a sprint boot application using Maven");
        model.addAttribute("msg", "This application is Ready to deployed on Kubernetes Cluster using Argo CD");
        model.addAttribute("msg", "Follow this repo for more info > https://github.com/Muhammadhassan1226/Java_CICD.git");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
