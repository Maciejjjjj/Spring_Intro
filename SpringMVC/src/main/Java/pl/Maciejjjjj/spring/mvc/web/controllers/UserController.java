package pl.Maciejjjjj.spring.mvc.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.Maciejjjjj.spring.doamin.User;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
public class UserController {

    private final Long counter = 0L;


    @GetMapping("/{id:[0-9]+}")
    public String showUser(Model model, @PathVariable Long id) {

        User user = new User();
        user.setId(id);
        user.setFirstName("Andrzej");
        user.setLastName("Andrzejewicz");
        user.setAge(108);
        user.setGender("Female");

        model.addAttribute("user", user);

        return "user";
    }

    @GetMapping("/add")
    public String prepareUserCreation() {

        return "add-user";
    }

    public String createUser(String firstName, String lastName, Integer age, String gender, Model model){

        //Long id = nextIdFromSession(session);

        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        user.setGender(gender);

        model.addAttribute("user", user);

        return "user";
    }

//    private Long nextIdFromSession(HttpSession session) {
//
//        if (session.getAttribute("nextUserId") == null) {
//            session.setAttribute("nextUserId", 1L);
//        }
//
//        Long nextUserId = (Long) session.getAttribute("nextUserId");
//        session.setAttribute("nextUserId", nextUserId + 1L);
//        return nextUserId;
//    }

}
