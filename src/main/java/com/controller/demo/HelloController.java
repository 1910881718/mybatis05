package com.controller.demo;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

//参数绑定
    @ResponseBody
    @RequestMapping("/test")
    public String test(User user, @RequestParam(required = false,defaultValue = "1") int pageNum){
        System.out.println(pageNum);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/test1")
    public String test1(Integer[] ids){
        for (Integer id : ids) {
            System.out.println(id);
        }
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/test2")
    public String test2(@RequestParam(required = false) List<Integer> ids,Integer ii,Integer i){
         ids=new ArrayList<Integer>();
         ids.add(ii);
         ids.add(i);
        for (Integer id : ids) {
            System.out.println(id);
        }
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/test3")
    public String test3(@RequestParam(required = false) Map<String,Integer> ids, String ii, Integer i){
        ids=new HashMap<>();
        ids.put(ii,i);
        for(Map.Entry<String,Integer> entry:ids.entrySet()){
            System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue());
        }
        return "ok";
    }

    //controller的方法返回值
    @RequestMapping("/delete")
    public String delete(){
        return "redirect:/demo/hello";
    }

    @RequestMapping("/test4")
    public ModelAndView test4(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","hello jaclk");
        mv.setViewName("hello");
        return mv;
    }
  //参数的类型
    @RequestMapping("/test5")
    public String test5(HttpServletRequest request,
                        HttpServletResponse response,
                        HttpSession session,
                        Model model){
        model.addAttribute("msg","model对象传的值");
        return "hello";
    }

}
