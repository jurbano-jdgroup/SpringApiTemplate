package com.template.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.template.api.dto.ItemDTO;
import com.template.api.dto.ResponseDTO;
import com.template.api.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemsController extends ErrorController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/{id}")
	public ResponseDTO findItemById(@PathVariable(value="id") Long id) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setResponse(this.itemService.findById(id));
		return responseDTO;
	}
	
	@GetMapping("/")
	public ResponseDTO findAll() {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setResponse(this.itemService.findAll());
		return responseDTO;
	}
	
	@PostMapping("/")
	public ResponseDTO save(@RequestBody ItemDTO item) {
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setResponse(this.itemService.save(item));
		return responseDTO;
	}
}