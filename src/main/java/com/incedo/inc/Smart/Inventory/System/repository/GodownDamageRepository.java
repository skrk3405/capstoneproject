package com.incedo.inc.Smart.Inventory.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.incedo.inc.Smart.Inventory.System.controller.entity.GodownDamageEntity;
@Repository



public interface GodownDamageRepository extends JpaRepository<GodownDamageEntity, Integer>{
	
}