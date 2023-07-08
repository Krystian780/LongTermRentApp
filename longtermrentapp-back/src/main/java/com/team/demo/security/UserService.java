package com.team.demo.security;

import com.team.demo.Exceptions.UserAlreadyExistException;
import com.team.demo.OfferModel.User;
import com.team.demo.Repository.UserRepository;
import com.team.demo.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerNewUserAccount(User user) throws UserAlreadyExistException {
        if (emailExists(user.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email address: "
                    + user.getEmail());
        }

        User newUser = new User();
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(user.getPassword());
        newUser.setEmail(user.getEmail());

        return userRepository.save(newUser);
    }

    private boolean emailExists(String email) {
        return userRepository.findAll().
                stream().map(User::getEmail).
                anyMatch(email::equalsIgnoreCase);
    }

}
