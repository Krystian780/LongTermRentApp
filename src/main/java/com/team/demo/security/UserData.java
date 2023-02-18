/*package com.team.demo.security;

import com.team.demo.Repository.UserRepository;
import com.team.demo.Service.UserService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class UserData implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String login;
    private String password;
    @Column(name = "password_token")
    private String passwordToken;
    @Column(name = "is_Authorized")
    private boolean isAuthorized;
    @Column(name = "is_Locked")
    private boolean isLocked = false;
    @Autowired
    UserService userService;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(login.equalsIgnoreCase("admin"))
            return List.of(() -> "read" + " " + "write");
        return List.of(() -> "read");
    }

    @Override
    public String getUsername() {
        return getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        if(userService.getUser(login)!=null){
            return true;
        }
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isAuthorized;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
*/