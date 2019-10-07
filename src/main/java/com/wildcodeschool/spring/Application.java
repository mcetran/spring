package com.wildcodeschool.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<ul>" +
                "<li><a href='http://localhost:8080/doctor/1'>First doctor</a></li>" +
                "<li><a href='http://localhost:8080/doctor/5'>Fifth doctor</a></li>" +
                "<li><a href='http://localhost:8080/doctor/8'>Eighth doctor</a></li>" +
                "<li><a href='http://localhost:8080/doctor/12'>Twelfth doctor</a></li>" +
                "</ul>";
    }

    @RequestMapping("/doctor/1")
    @ResponseBody
    public String doctorOne() {
        return "William Hartnell<br><a href='http://localhost:8080/'><-</a>";
    }

    @RequestMapping("/doctor/5")
    @ResponseBody
    public String doctorFive() {
        return "Peter Davison<br><a href='http://localhost:8080/'><-</a>";
    }

    @RequestMapping("/doctor/8")
    @ResponseBody
    public String doctorEight() {
        return "Paul McGann<br><a href='http://localhost:8080/'><-</a>";
    }

    @RequestMapping("/doctor/12")
    @ResponseBody
    public String doctorTwelve() {
        return "Peter Capaldi<br><a href='http://localhost:8080/'><-</a>";
    }
}
