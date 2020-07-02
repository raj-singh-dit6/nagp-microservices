package com.nagp.msa.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagp.msa.user.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

}
