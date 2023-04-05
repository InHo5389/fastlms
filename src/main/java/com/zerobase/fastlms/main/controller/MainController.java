package com.zerobase.fastlms.main.controller;

import com.zerobase.fastlms.component.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MailComponents mailComponents;

    @RequestMapping("/")
    public String index(){

//        String email = "qheogus55@gmail.com";
//        String subject = "안녕하세여. 제로베이스입니다.";
//        String text = "<p>안녕하세요.</p><p>반갑습니다</p>";
//        mailComponents.sendMail(email,subject,text);
        return "index";
    }




}
