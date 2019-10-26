package pl.Maciejjjjj.spring.mvc.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/parameters")
public class ParametersController {

    @ResponseBody
    @GetMapping("/raw")
    public String serveRawParameters(HttpServletRequest request) {

        String first = request.getParameter("first");
        String second = request.getParameter("second");

        if (first == null && second == null) {
            return "No parameters";
        } else if (first == null && second != null) {
            return "Second parameter: " + second + ".";
        } else if (first != null && second == null) {
            return "First parameter: " + first + ".";
        } else {
            return "First parameter: " + first + ", second parameter: " + second + ".";
        }
    }

    @ResponseBody
    @GetMapping("/spring")
    public String serveSpringParameters(
           @RequestParam(value = "first", required = false) String first,
           @RequestParam(defaultValue = "Abrakadabra") String second) {


        if (first == null && second == null) {
            return "No parameters";
        } else if (first == null && second != null) {
            return "Second parameter: " + second + ".";
        } else if (first != null && second == null) {
            return "First parameter: " + first + ".";
        } else {
            return "First parameter: " + first + ", second parameter: " + second + ".";
        }
    }
}
