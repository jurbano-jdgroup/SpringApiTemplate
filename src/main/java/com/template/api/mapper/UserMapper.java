package com.template.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.template.api.dto.UserDTO;
import com.template.api.entity.User;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	User userDTOtoUser(UserDTO user);
	UserDTO userToUserDTO(User user);
	List<UserDTO> userListToUserDTOList(List<User> userList);
}