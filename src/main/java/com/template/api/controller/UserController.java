package com.template.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.template.api.dto.ResponseDTO;
import com.template.api.dto.UserDTO;
import com.template.api.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController extends ErrorController {	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	public ResponseDTO getById(@PathVariable(value="id") Long id) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setResponse(this.userService.findById(id));
		return responseDTO;
	}
	
	@GetMapping("/")
	public ResponseDTO getAll() {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setResponse(this.userService.findAll());
		return responseDTO;
	}
	
	@PostMapping("/")
	public ResponseDTO save(@RequestBody UserDTO user) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setResponse(this.userService.save(user));
		return responseDTO;
	}
}