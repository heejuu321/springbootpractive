package com.example.demo.controller;

import com.example.demo.error.CouponExpirationException;
import com.example.demo.error.CouponNotFoundException;
import com.example.demo.error.InvalidParameterException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.lang.reflect.Member;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @GetMapping("/member")
    public String memberException(@Valid Member dto, BindingResult result) {
        if (result.hasErrors()) {
            throw new InvalidParameterException(result);
        }

        return "page/home";
    }

    @GetMapping("/exception")
    public String exceptionTest(String code) {
        switch (code) {
            case "1":
                throw new CouponExpirationException();
            case "2":
                throw new CouponNotFoundException();
            case "3":
                int a = 3 / 0;
                break;
        }
        return "home";
    }
}