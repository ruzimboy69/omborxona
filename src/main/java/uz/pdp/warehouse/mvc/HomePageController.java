package uz.pdp.warehouse.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pdp.warehouse.payload.UserDto;

@Controller
@RequestMapping("/")

public class HomePageController {
    @GetMapping
    public String getHomePage(Model model){
        model.addAttribute("userDto",new UserDto());
        return "registration";
    }
}
