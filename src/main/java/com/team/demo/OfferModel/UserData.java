package com.team.demo.OfferModel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    @Column(unique = true)
    private String login;
    private String password;
    private String passwordToken = "password";
    private boolean isAuthorized = true;
    private boolean isLocked = false;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(login.equalsIgnoreCase("admin"))
            return List.of(() -> "read" + " " + "write");
        return List.of(() -> "read");
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
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
