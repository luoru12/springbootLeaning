package com.york.feignservice;

import org.springframework.stereotype.Component;

/**
 * @author chenyq
 * @create 2019-04-24
 */
@Component
public class FeignServiceImpl implements FeignService {

    @Override
    public String syaHi(String name) {
        return "the dey ssssss11111sssssssssssss";
    }
}
