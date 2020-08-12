package pl.javastart.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @RequestMapping("/") // nie działa, nie otiwera się strona poprawna
    public String home(){
        return "home";
    }
}
