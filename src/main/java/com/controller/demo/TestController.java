package com.controller.demo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/demo")
public class TestController {
//访问静态文件
  @RequestMapping("/demo1")
    public String demo1(){
      return "demo";
  }
//REST风格
  @RequestMapping("/demo2/{name}/{age}")
    public String demo2(@PathVariable String name,@PathVariable Integer age){
      System.out.println(name);
      System.out.println(age);
      return "demo";

  }

  //数据格式化
    @RequestMapping("/demo3")
    public String demo3(@DateTimeFormat(pattern = "yyyy-MM-dd")Date date){
        System.out.println(date);
     return "demo";
    }

    //文件上传
    @RequestMapping("/reg")
    public String reg(){
      return "user_reg";
    }

    @RequestMapping("/demo4")
    public String demo4(HttpServletRequest request, String name, MultipartFile image){
      String fileName=image.getOriginalFilename();

      String realPath=request.getSession().getServletContext().getRealPath("/statics/upload");
        System.out.println(realPath);
        String newFileName= UUID.randomUUID()+fileName.substring(fileName.lastIndexOf("."));
        System.out.println(realPath+"/"+newFileName);
        File file=new File(realPath+"/"+fileName);
        try {
            image.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
         return "user_reg";

    }

    @RequestMapping("/demo5")
  public String demo5(@ModelAttribute User user, Model model){
    String [] allLove={"吃饭","睡觉","打豆豆"};
      List<City> cityList=new ArrayList<>();
      cityList.add(new City(1,"长沙"));
      cityList.add(new City(2,"娄底"));
      model.addAttribute("allLoves",allLove);
      model.addAttribute("cityList",cityList);
      return "demo5";
    }

}
