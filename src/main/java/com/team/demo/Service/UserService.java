package com.team.demo.Service;

import com.team.demo.Exceptions.UserAlreadyExistException;
import com.team.demo.Repository.UserRepository;
import com.team.demo.security.User;
import com.team.demo.security.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerNewUserAccount(UserDto userDto) throws UserAlreadyExistException {
        if (emailExists(userDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email address: "
                    + userDto.getEmail());
        }
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setRoles(Arrays.asList("ROLE_USER"));

        return userRepository.save(user);
    }


    private boolean emailExists(String email) {
        List<UserDto> allUsers = userRepository.findAll();
        for(UserDto userDto:allUsers){
            if(email.equalsIgnoreCase(email)){
                return true;
            }
        }
        return false;
    }

}

