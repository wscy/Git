package com.demo_boot.Controller;

import com.demo_boot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginControl {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/checkLogin")
    public String loginIn(String userName,String password){
        if(userName.isEmpty()||password.isEmpty()){
            return "login";
        }
        else{
            boolean flag=studentService.CheckLogin(userName,password);
            if(flag){
                return "index";
            }
        }
        return "error";
    }
}
