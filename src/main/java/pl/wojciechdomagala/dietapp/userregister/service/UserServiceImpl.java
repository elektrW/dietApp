//package pl.wojciechdomagala.dietapp.userregister.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import pl.wojciechdomagala.dietapp.userregister.model.User;
//import pl.wojciechdomagala.dietapp.userregister.repository.UserRepository;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    private UserRepository userRepository;
//
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public void saveNewUser(User user) {
//        this.userRepository.save(user);
//    }
//
//    @Override
//    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
//        this.setPasswordEncoder(passwordEncoder);
//    }
//
//
//
//}
