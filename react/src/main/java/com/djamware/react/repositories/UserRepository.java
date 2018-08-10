package com.djamware.react.repositories;

import org.springframework.data.repository.CrudRepository;

import com.djamware.react.models.User;

public interface UserRepository extends CrudRepository<User, String> {
	User findByUserName(String userName);
    
}
