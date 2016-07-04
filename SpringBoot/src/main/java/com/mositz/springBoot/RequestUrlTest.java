package com.mositz.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangxingxing on 16/7/4.
 */
@RestController
@RequestMapping("/request")
public class RequestUrlTest{

    @Autowired
    private MyBean myBean;

    @RequestMapping("/myBean")
    @ResponseBody
    public String testMyBean(){
        return myBean.getName();
    }

    @RequestMapping("/myBean2")
    @ResponseBody
    public String testMyBean2() throws Exception {
         throw new Exception("aaa");
    }


}
