package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.ScorePK;
import com.devsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, ScorePK> {

	User findByEmail(String email);

}
