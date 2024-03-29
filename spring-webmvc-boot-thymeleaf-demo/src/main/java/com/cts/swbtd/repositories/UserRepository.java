package com.cts.swbtd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.swbtd.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
	List<User> findByName(String name);

}
