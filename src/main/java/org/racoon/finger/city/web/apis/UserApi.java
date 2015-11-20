package org.racoon.finger.city.web.apis;

import javax.websocket.server.PathParam;

import org.racoon.finger.city.jpa.entity.User;
import org.racoon.finger.city.jpa.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by long, created on Nov 20, 2015
 */
@RestController
@RequestMapping(value = "/users.json")
public class UserApi {

	@Autowired
	UserRepository userRepository;

	@RequestMapping(value = "/{id}")
	public User getUserById(@PathParam("id") int id) {
		return userRepository.findOne(id);
	}
}
