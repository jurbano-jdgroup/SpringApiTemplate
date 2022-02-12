package com.template.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.api.dto.PurchaseDTO;
import com.template.api.entity.Purchase;
import com.template.api.mapper.PurchaseMapper;
import com.template.api.repository.PurchaseRepository;

@Service
public class PurchaseService {
	@Autowired
	private PurchaseRepository purchaseRepository;

	public Purchase findById(Long id) {
		return this.purchaseRepository.findPurchaseByIdAny(id);
	}

	public PurchaseDTO save(PurchaseDTO purchaseDTO) {
		Purchase purchase = PurchaseMapper.INSTANCE.purchaseDTOToPurchase(purchaseDTO);
		return PurchaseMapper.INSTANCE.purchaseToPurchaseDTO(this.purchaseRepository.save(purchase));
	}
	
	public List<PurchaseDTO> findAll() {
		return PurchaseMapper.INSTANCE.purchaseListToDTOList(this.purchaseRepository.findAll());
	}
}