package com.imooc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller 表示这个类是一个controller ，能够接收前台发送的请求，去做相应的数据处理
//@ResponseBody 将我们的数据或者内容作为HTTP的响应返回
@RestController
public class hello {
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}
