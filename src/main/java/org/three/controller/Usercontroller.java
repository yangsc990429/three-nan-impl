package org.three.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.three.service.TestService;

@Controller
@RequestMapping("user")
public class Usercontroller {
    @Autowired
    private  TestService testService;
   @RequestMapping("userList")
 public  String userList(Model model){
 String name = testService.userList("小啊啊大苏打");
model.addAttribute("user",name);

    return "aa";
}

}
