package com.demo.SpringMVC1.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")  
    public String redirect()  
    {  
        return "viewpage";  
    }     
@RequestMapping("/helloagain")  
public String display()  
{  
    return "final";  
}  
}
