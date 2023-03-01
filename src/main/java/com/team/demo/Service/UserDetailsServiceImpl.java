package com.team.demo.Service;

import com.team.demo.security.CustomUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.security.NoSuchAlgorithmException;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements CustomUserDetailsService {
 //   private final UserDataRepository userDataRepository;
  //  private final CryptographicService cryptographicService;

    @Override
    public UserDetails loadUserByUsername(String login) {
        return null;
    }

    @Override
    public void createUser(String login, String password) throws NoSuchAlgorithmException, LoginException {

    }
}
