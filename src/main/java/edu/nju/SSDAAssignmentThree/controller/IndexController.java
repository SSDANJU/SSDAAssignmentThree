package edu.nju.SSDAAssignmentThree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/bookInfoEdit")
    public String bookInfoEdit(){
        return "bookInfoEdit";
    }

    @RequestMapping("/bookInfoEditDetail")
    public String bookInfoEditDetail(){
        return "bookInfoEditDetail";
    }

    @RequestMapping("/userInfoEdit")
    public String userInfoEdit(){
        return "userInfoEdit";
    }

    @RequestMapping("/userInfoEditDetail")
    public String userInfoEditDetail(){
        return "userInfoEditDetail";
    }

    @RequestMapping("/personalInfoEdit")
    public String personalInfoEdit(){
        return "personalInfoEdit";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
}
