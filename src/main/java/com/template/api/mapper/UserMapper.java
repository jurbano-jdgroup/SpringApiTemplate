package com.template.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.template.api.dto.UserDTO;
import com.template.api.entity.User;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	User userDTOtoUser(UserDTO user);
	UserDTO userToUserDTO(User user);
}