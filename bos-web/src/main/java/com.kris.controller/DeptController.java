package com.kris.controller;

import com.kris.pojo.DeptP;
import com.kris.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User:kris
 * date:2017/3/28
 * time:15:22
 * des:
 */
@Controller
public class DeptController {

    @Autowired
    private DeptService mDeptService;

    @RequestMapping("/dept/{id}")
    @ResponseBody
    public DeptP getItemById(@PathVariable String id){
        System.out.println("11111111");
        DeptP dept = mDeptService.getDeptById(id);
        return dept;
    }

}
