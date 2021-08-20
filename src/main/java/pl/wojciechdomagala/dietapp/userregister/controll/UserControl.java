//package pl.wojciechdomagala.dietapp.userregister.controll;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.ObjectError;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import pl.wojciechdomagala.dietapp.userregister.model.User;
//import pl.wojciechdomagala.dietapp.userregister.service.UserService;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@Controller
//public class UserControl {
//
//    private UserService userService;
//
//    @Autowired
//    public UserControl(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping("/register")
//    public String register(Model model) {
//        model.addAttribute("user", new User());
//        return "registerForm";
//    }
//
//    @PostMapping("/register")
//    public String addUser(@ModelAttribute @Valid User user,
//                          BindingResult result) {
//        if (result.hasErrors()) {
//            List<ObjectError> errors = result.getAllErrors();
//            errors.forEach(err -> System.out.println(err.getDefaultMessage()));
//            return "registerForm";
//        } else {
//            userService.saveNewUser(user);
//            return "registerSuccess";
//        }
//    }
//
//}
