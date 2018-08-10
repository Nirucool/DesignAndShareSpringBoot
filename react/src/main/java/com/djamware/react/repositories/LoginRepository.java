package com.djamware.react.repositories;

import org.springframework.data.repository.CrudRepository;

import com.djamware.react.models.Login;

public interface LoginRepository extends CrudRepository<Login, String> {
        @Override
        void delete(Login deleted);
    
}
