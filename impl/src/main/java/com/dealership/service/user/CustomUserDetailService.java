package com.dealership.service.user;//package com.dealership.apispringbootdealership.service.user;
//
//import com.dealership.apispringbootdealership.entity.Role;
//import com.dealership.apispringbootdealership.entity.User;
//import com.dealership.apispringbootdealership.repository.RoleRepository;
//import com.dealership.apispringbootdealership.repository.UserRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Collections;
//import java.util.HashSet;
//
//@AllArgsConstructor
//@Service
//public class CustomUserDetailService implements UserDetailService{
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private RoleRepository roleRepository;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    public User findByEmail(String email){
//        return userRepository.findByEmail(email);
//    }
//
//    public void saveUser(User user){
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setEnable(true);
//        Role userRole = roleRepository.findByRole("ADMIN");
//        user.setRoles(new HashSet<>(Collections.singletonList(userRole)));
//        userRepository.save(user);
//    }
//
//}
