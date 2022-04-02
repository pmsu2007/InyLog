package com.mysite.inylog;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InyLogController {
    @RequestMapping("/home")
    @ResponseBody
    public String hello() {
        return "Hello InyLog";
    }
}
