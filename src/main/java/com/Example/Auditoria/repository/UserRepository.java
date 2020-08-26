package com.Example.Auditoria.repository;

import org.springframework.data.repository.CrudRepository;

import com.Example.Auditoria.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	

}
