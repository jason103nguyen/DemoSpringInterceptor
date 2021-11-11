package com.phuongnt.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.sql.SQLException;

@Controller
@RequestMapping(value = "/hello")
public class WelcomeController {

    @GetMapping(value = "/")
    public String hello() {
        return "hello";
    }

    @GetMapping(value = "/vietnam")
    public String helloVietName() {
        return "helloVietNam";
    }
}
