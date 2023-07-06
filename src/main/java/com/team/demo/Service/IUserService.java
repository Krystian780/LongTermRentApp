package com.team.demo.Service;

import com.team.demo.security.User;
import com.team.demo.security.UserDto;

public interface IUserService {

    public User registerNewUserAccount(UserDto userDto);

}
