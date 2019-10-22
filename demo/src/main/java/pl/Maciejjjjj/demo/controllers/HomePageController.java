package pl.Maciejjjjj.demo.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.Maciejjjjj.demo.model.domain.Advert;
import pl.Maciejjjjj.demo.model.repositories.AdvertRepository;

@Controller
@RequestMapping("/")
public class HomePageController {

    private final AdvertRepository advertRepository;

    public HomePageController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    @GetMapping
    public String prepareHomePage(Model model) {
        List<Advert> allAdverts = advertRepository.findAllByOrderByPostedDesc();
        model.addAttribute("adverts", allAdverts);
        return "/WEB-INF/views/home-page.jsp";
    }
}
