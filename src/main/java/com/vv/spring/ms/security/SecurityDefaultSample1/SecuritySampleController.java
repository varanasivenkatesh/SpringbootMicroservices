package com.vv.spring.ms.security.SecurityDefaultSample1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class SecuritySampleController
{

    @RequestMapping("/")
    public String getMessage()
    {
        return "Hellow";
    }

}
