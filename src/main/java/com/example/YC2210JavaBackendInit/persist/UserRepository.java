package com.example.YC2210JavaBackendInit.persist;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.YC2210JavaBackendInit.User;

@Component
public interface UserRepository extends CrudRepository<User, Long>{

	Optional<User> findByEmail(String email);

	

}
