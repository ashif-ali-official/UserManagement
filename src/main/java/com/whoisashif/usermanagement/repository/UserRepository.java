package com.whoisashif.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.whoisashif.usermanagement.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
