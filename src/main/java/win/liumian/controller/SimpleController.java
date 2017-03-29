package win.liumian.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumian on 2017/3/29.
 */
@RestController
@EnableAutoConfiguration
public class SimpleController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello"+name;
    }


}
