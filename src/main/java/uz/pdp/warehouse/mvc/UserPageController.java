package uz.pdp.warehouse.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.pdp.warehouse.entity.User;
import uz.pdp.warehouse.payload.UserDto;
import uz.pdp.warehouse.repository.UserRepository;

import java.util.List;

@Controller
@RequestMapping("/ombor/enter/check")
public class UserPageController {
    @Autowired
    UserRepository userRepository;
    @PostMapping
        public String checkAdmin(Model model,UserDto userDto){
        for (User user : userRepository.findAll()) {
            if(user.getPhoneNumber().equals(userDto.getPhoneNumber()) && user.getPassword().equals(userDto.getPassword())){
                return "mainMenu";
            }
        }
        return "registration";

    }


}
