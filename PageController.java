package com.jk.xys.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("page")
public  class  PageController {
///////////////////////////////////
     //厉害了我的哥我以及大家卡监督卡监督卡我已经在网站上改过了
	 //我加了一个方法toShow22
	  @RequestMapping("toShow22")
    public String toShow(){
        return "show";

    }
//分支到此一游/
    @RequestMapping("toShow")
    public String toShow(){
        return "show";

    }
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("login2")
    public  String login2(){
        return "login2";
    }
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
    @RequestMapping("toComments")
    public String toComments(Integer id, Model model){
        model.addAttribute("id",id);
        return "comments";
    }
    @RequestMapping("commentsShow")
    public String commentsShow(){
        return "commentsShow";
    }
    @RequestMapping("noteLogin")
    public String noteLogin(){
        return "noteLogin";
    }
    @RequestMapping("tolog")
    public String tolog(){
        return "log";
    }
}
