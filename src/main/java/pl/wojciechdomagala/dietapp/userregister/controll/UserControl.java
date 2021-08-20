package pl.wojciechdomagala.dietapp.userregister.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wojciechdomagala.dietapp.userregister.model.User;
import pl.wojciechdomagala.dietapp.userregister.service.UserService;

import javax.validation.Valid;

public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "registerForm";
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute @Valid User user,
                          BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registerForm";
        } else {
            userService.addWithDefaultRole(user);
        }
    }

}
