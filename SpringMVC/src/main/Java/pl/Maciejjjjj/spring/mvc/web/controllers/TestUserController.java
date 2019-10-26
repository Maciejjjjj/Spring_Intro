package pl.Maciejjjjj.spring.mvc.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/test-user")
public class TestUserController {

    @GetMapping
    public String get() {
        return "TestUserController.get";
    }

    @PostMapping
    public String post() {
        return "TestUserController.post";
    }

    @PutMapping
    public String put() {
        return "TestUserController.edit";
    }

   @DeleteMapping
    public String delete() {
        return "TestUserController.delete";
    }
}
