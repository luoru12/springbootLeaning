package com.york.serviceribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenyq
 * @create 2019-04-24
 */
@Component
public class RestService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiFallBack")
    public String hiService(String name){
        return restTemplate.getForObject("http://YORK-HI/hi?name="+name,String.class);
    }

    public String hiFallBack(String name){
        return "hi,"+name+",sorry error!";
    }
}
