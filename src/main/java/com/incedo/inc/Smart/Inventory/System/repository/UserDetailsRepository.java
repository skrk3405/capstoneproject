package com.incedo.inc.Smart.Inventory.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.inc.Smart.Inventory.System.controller.entity.UserDetails;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer>{
	
}