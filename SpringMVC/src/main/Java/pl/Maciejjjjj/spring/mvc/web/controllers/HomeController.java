package pl.Maciejjjjj.spring.mvc.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(path = "/hello", method = RequestMethod.GET)
public class HomeController {

    @ResponseBody
    @GetMapping ("/hello")
    public String sayHello() {

        return "Hello, World!";
    }

    @GetMapping("/helloJSP")
    public String sayHelloJSP() {

        return "hello";
    }


}
