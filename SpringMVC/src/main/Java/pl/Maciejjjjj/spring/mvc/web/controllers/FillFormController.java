package pl.Maciejjjjj.spring.mvc.web.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/fill-form")

public class FillFormController {

    @PostMapping
    public String post() {
        return "FillFormController.post";
    }

}
