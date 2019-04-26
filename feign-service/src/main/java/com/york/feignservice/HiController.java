package com.york.feignservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyq
 * @create 2019-04-24
 */
@RestController
public class HiController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    public String sayHiCtrl(@PathVariable("name") String name){
        return feignService.syaHi(name);
    }
}
