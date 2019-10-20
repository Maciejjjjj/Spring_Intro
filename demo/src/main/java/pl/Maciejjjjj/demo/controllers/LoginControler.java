package pl.Maciejjjjj.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.Maciejjjjj.demo.model.domain.User;
import pl.Maciejjjjj.demo.model.repositories.UserRepository;

@Controller
@RequestMapping("/login")
public class LoginControler {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public LoginControler(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @GetMapping
    public String prepareLoginPage() {
        return "/WEB-INF/views/login-page.jsp";
    }
}