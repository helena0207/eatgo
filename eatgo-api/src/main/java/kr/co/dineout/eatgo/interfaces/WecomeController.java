package kr.co.dineout.eatgo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WecomeController {

    @GetMapping("/")
    public String hello(){
        return "hello, world!";
    }
}
