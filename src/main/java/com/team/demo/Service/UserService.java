/*
package com.team.demo.Service;


import com.team.demo.Repository.UserRepository;
import com.team.demo.security.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserData getUser(String login){
        return userRepository.findAll()
                .stream()
                .filter(x -> x.getLogin().equalsIgnoreCase(login))
                .findFirst().get();
    }

    public UserData addUser(UserData userData){
        return userRepository.save(userData);
    }

    public UserData getUserData(){
        return
    }

}
*/