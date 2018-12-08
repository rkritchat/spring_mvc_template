package com.rkritchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        int num1 = Integer.parseInt(request.getParameter("n1"));
        int num2 = Integer.parseInt(request.getParameter("n2"));

        ModelAndView view = new ModelAndView();
        view.setViewName("result");
        view.addObject("sum", num1 + num2);
        return view;
    }
}
