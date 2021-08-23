//package pl.wojciechdomagala.dietapp.userregister.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Controller;
//import pl.wojciechdomagala.dietapp.userregister.model.User;
//import pl.wojciechdomagala.dietapp.userregister.repository.UserRepository;
//
//@Controller
//public class UserDetailsCustomService implements UserDetailsService {
//
//    private UserRepository userRepository;
//    private UserDetails userDetails;
//
//    @Autowired
//    public UserDetailsCustomService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return userDetails;
//    }
//}