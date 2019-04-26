package com.york.serviceribbon;

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
    private RestService restService;

    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    public String sayHi(@PathVariable("name") String name){
        return restService.hiService(name);
    }
}
