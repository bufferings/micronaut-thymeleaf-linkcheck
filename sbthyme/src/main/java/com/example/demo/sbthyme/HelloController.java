package com.example.demo.sbthyme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping({"/", "/sample"})
    public String index() {
        return "hello";
    }
}
