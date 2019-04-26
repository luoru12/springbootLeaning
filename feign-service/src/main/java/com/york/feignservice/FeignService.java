package com.york.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chenyq
 * @create 2019-04-24
 */
@FeignClient(name = "york-hi",fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String syaHi(@RequestParam(value = "name") String name);

}
