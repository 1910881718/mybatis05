package com.controller.demo;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public  String login(@ModelAttribute @Validated User user, BindingResult result, Model model){
       if (result.hasErrors()){
           List<FieldError> erros=  result.getFieldErrors();
           Map<String,String> map=new HashMap<>();

           for (FieldError erro : erros) {
               map.put(erro.getField(),erro.getDefaultMessage());
               model.addAttribute("map",map);
           }
           return "i18n";
       }
        return "hello" ;
    }
}
