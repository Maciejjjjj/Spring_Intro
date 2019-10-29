package pl.Maciejjjjj.spring.mvc.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.Maciejjjjj.spring.doamin.User;
import pl.Maciejjjjj.spring.doamin.UserDTO;
import pl.Maciejjjjj.spring.mvc.core.services.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
public class UserController {


    private Long counter = 0L;

    private UserService userService = new UserService();

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id:[0-9]+}")
    public String showUser(Model model, @PathVariable Long id) {

        UserDTO user = userService.getUser(id);


        model.addAttribute("user", user);

        return "user";
    }

    @GetMapping("/add")
    public String prepareUserCreation() {

        return "add-user";
    }

    @PostMapping("/add")
    public String createUser(UserDTO user, Model model) {

        //Long id = nextIdFromSession(session);

        //counter++;

//        User user = new User();
//        user.setId(counter);
//        user.setFirstName(firstName);
//        user.setLastName(lastName);
//        user.setAge(age);
//        user.setGender(gender);

        Long id = userService.saveUser(user);
        user.setId(id);

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
