package com.springboot.crud.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.crud.entitis.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
