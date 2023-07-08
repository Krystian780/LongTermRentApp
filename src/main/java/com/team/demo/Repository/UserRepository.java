package com.team.demo.Repository;

import com.team.demo.OfferModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
