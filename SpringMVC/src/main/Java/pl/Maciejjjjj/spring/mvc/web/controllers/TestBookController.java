package pl.Maciejjjjj.spring.mvc.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestBookController {

    @GetMapping("/test-book")
    public String get() {
        return "TestBookController.get";
    }

    @PostMapping("/test-book/add")
    public String add() {
        return "TestBookController.add";
    }

    @PostMapping("/test-book/edit")
    public String edit() {
        return "TestBookController.edit";
    }

    @PostMapping("/test-book/delete")
    public String delete() {
        return "TestBookController.delete";
    }
}
