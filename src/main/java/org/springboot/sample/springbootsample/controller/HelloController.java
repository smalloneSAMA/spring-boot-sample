package org.springboot.sample.springbootsample.controller;


import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping("/hello")
public class HelloController {



    @RequestMapping
    public String hello(HttpServletRequest request){
        request.getSession();
        return "hello world";
    }

    @RequestMapping("/info")
    public Map<String, String> getInfo(@RequestParam String name){

        Map<String,String> map = new HashMap<>();
        map.put("name",name);
        return map;

    }

    @RequestMapping("/list")
    public List<Map<String, String>> getList(){

        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = null;
        for(int i=1; i<=5; i++){
            map = new HashMap<>();
            map.put("name","smallone"+i);
            list.add(map);

        }

        return list;

    }


}
