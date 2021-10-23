package com.template.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.template.api.dto.ItemDTO;
import com.template.api.dto.ItemResponseDTO;
import com.template.api.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemsController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/{id}")
	public ItemResponseDTO findItemById(@PathVariable(value="id") Integer id) {
		return this.itemService.findById(id);
	}
	
	@PostMapping("/")
	public ItemResponseDTO save(@RequestBody ItemDTO item) {
		return this.itemService.save(item);
	}
}