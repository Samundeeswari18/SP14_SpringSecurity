package com.sam.sp14_spring_security.service;

import com.sam.sp14_spring_security.JPA_Entity.User;
import com.sam.sp14_spring_security.dataTransferObject.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDetails loadUserByUsername(String userName);
    public void creat(UserDTO userDTO);
    public User findUserByEmail(String email);
    public User findUserByName(String name);
}


