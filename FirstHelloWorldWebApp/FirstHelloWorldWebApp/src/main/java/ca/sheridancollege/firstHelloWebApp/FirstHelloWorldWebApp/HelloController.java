package ca.sheridancollege.firstHelloWebApp.FirstHelloWorldWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
//controller
    @GetMapping("/index")
    public String showRiteshyadavPage(Model model) {
        return "index";
    }

}

