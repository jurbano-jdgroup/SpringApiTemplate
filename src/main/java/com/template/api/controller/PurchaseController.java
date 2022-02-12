package com.template.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.template.api.dto.PurchaseDTO;
import com.template.api.dto.ResponseDTO;
import com.template.api.service.PurchaseService;

@RestController
@RequestMapping("/purchases")
public class PurchaseController extends ErrorController {
	
	@Autowired
	private PurchaseService purchaseService;
	
	@PostMapping("/")
	public ResponseDTO save(@RequestBody PurchaseDTO purchaseDTO) {
		ResponseDTO response  = new ResponseDTO();
		response.setResponse(this.purchaseService.save(purchaseDTO));
		return response;
	}
	
	@GetMapping("/")
	public ResponseDTO getAll() {
		ResponseDTO response  = new ResponseDTO();
		response.setResponse(this.purchaseService.findAll());
		return response;
	}
	
	@GetMapping("/{id}")
	public ResponseDTO findById(@PathVariable(value="id") Long id) {
		ResponseDTO response  = new ResponseDTO();
		response.setResponse(this.purchaseService.findById(id));
		return response;
	}
}