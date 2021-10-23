package com.template.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.api.dto.UserDTO;
import com.template.api.entity.User;
import com.template.api.mapper.UserMapper;
import com.template.api.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * Find the item with the id specified
	 * @param id
	 * @return
	 */
	public UserDTO findById(Long id) {
		final Optional<User> optional = this.userRepository.findById(id);
		
		if (optional.isEmpty()) {
			return null;
		}
		
		return UserMapper.INSTANCE.userToUserDTO(optional.get());
	}
	
	/**
	 * Save the specified item and return the response DTO
	 * @param itemDTO
	 * @return
	 */
	public UserDTO save(UserDTO user) {
		User userToSave = UserMapper.INSTANCE.userDTOtoUser(user);
		
		return UserMapper.INSTANCE.userToUserDTO(this.userRepository.save(userToSave));
	}
}