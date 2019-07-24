package com.demo_boot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuChen
 * @version 1.0
 * @date 2019/7/16 19:18
 * Describle 描述
 */
@Controller
public class Index {

@RequestMapping("/")
    public String homePage(){
    return "login";
}
}
