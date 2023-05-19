package com.devops.DevopsExample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping("/hello")
    public String sayHello(){
        return  " Hello Devops Example</br>" +
                "Lets Include the Following</br>" +
                "- Build\n </br>" +
                "- Run Unit test\n</br>" +
                "- Run Automation\n</br>" +
                "- Run Security Tests\n</br>" +
                "- Build Dockerfile Image\n</br>" +
                "- Scan image\n</br>" +
                "- Push image to GAR\n</br>" +
                "- Deploy image to Registry\n</br>" +
                "- Deploy app to GKE\n</br>" +
                "- Istio\n";
    }
}
