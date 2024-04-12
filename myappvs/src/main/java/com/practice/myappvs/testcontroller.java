package com.practice.myappvs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testcontroller {

    @RequestMapping("/test")
    @ResponseBody
    public String handle() {
        return "This is just for fun!!";
    }

}
