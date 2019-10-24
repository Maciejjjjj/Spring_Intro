package pl.Maciejjjjj.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import pl.Maciejjjjj.demo.model.domain.Advert;
import pl.Maciejjjjj.demo.model.repositories.AdvertRepository;
import pl.Maciejjjjj.demo.model.repositories.UserRepository;

import java.security.Principal;
import java.time.LocalDateTime;

@Controller
public class AdvertController {


    private final UserRepository userRepository;
    private final AdvertRepository advertRepository;

    @Autowired
    public AdvertController(UserRepository userRepository, AdvertRepository advertRepository) {
        this.userRepository = userRepository;
        this.advertRepository = advertRepository;
    }

    @PostMapping("/add-advert")
    public String addAdvert(String title, String description, Principal principal) {

        String username = principal.getName();

        Advert advert = new Advert();
        advert.setTitle(title);
        advert.setDescription(description);
        advert.setOwner(userRepository.findByUsername(username));
        advert.setPosted(LocalDateTime.now());


        advertRepository.save(advert);


        return "redirect:/";
    }

}
