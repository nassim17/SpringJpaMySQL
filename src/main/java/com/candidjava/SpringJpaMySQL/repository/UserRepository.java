package com.candidjava.SpringJpaMySQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candidjava.SpringJpaMySQL.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
