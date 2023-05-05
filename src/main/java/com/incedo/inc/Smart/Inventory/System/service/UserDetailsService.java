package com.incedo.inc.Smart.Inventory.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.incedo.inc.Smart.Inventory.System.controller.entity.UserDetails;

@Service
public class UserDetailsService {
	@Autowired
	com.incedo.inc.Smart.Inventory.System.repository.UserDetailsRepository UserDetailsRepository;
	@Autowired

	//RestTemplate restTemplate;

	public List<UserDetails> getAll() {
		return UserDetailsRepository.findAll();

	}

	//public UserDetails isTokenValid(String jwtToken) {

		//HttpHeaders headers = new HttpHeaders();

		//headers.set("Authorization", jwtToken);

		//HttpEntity entity = new HttpEntity(headers);

		//try {

			//ResponseEntity<UserDetails> result = this.restTemplate.exchange(

					//"http://localhost:8001/pm/user-management/token/validate", HttpMethod.GET, entity,
					//UserDetails.class);

			//return result.getBody();

		//} catch (Exception e) {

		//	return new UserDetails();

	//	}

	//}

}
