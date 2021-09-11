package com.controller.demo.admin;

import com.pojo.User;
import com.util.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/admin/user")
public class UserController {

    @RequestMapping("/list")
    @ResponseBody
    public AjaxResult list(User user){
   AjaxResult ar=new AjaxResult();
        return ar;
    }
    @RequestMapping("/list1")
    @ResponseBody
    public AjaxResult list1(@RequestBody User user){
        AjaxResult ar=new AjaxResult();
        return ar;
    }

}
