package com.team.demo.security;

import com.team.demo.UserDataModel.UserData;
import com.team.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserData getUser(String login){
        return userRepository.findAll()
                .stream()
                .filter(x -> x.getUsername().equalsIgnoreCase(login))
                .findFirst().get();
    }

    public UserData addUser(UserData userData){
        return userRepository.save(userData);
    }
    
}
