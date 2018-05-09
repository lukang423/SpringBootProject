package com.lacus.demo.first.controller;

import com.lacus.demo.first.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/first")
public class FirstController {

    @Autowired
    private FirstService firstService;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        return "first/hello";
    }


    @RequestMapping("/getAll")
    @ResponseBody
    public List<HashMap> getAllTelent(HttpServletRequest request){
        HashMap hashMap=new HashMap();
        return firstService.doSelectAll(hashMap);
    }


    @RequestMapping("/getOne")
    @ResponseBody
    public HashMap getOneTelent(HttpServletRequest request){
        String telentId=request.getParameter("telentId");
        if(telentId!=null){
            HashMap hashMap=new HashMap();
            hashMap.put("telent_id",telentId);
            return firstService.doSelectOne(hashMap);
        }
        else
        {
            HashMap hashMap=new HashMap();
            hashMap.put("code","fail");
            hashMap.put("message","telentId不能为空");
            hashMap.put("data","");
            return hashMap;
        }
    }
}
