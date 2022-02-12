package com.template.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.template.api.dto.PurchaseDTO;
import com.template.api.entity.Purchase;

@Mapper
public interface PurchaseMapper {
	PurchaseMapper INSTANCE = Mappers.getMapper(PurchaseMapper.class);
	
	@Mapping(target="user.id", source="userId")
	@Mapping(target="item.id", source="itemId")
	Purchase purchaseDTOToPurchase(PurchaseDTO purchase);
	
	@Mapping(target="userId", source="user.id")
	@Mapping(target="itemId", source="item.id")
	PurchaseDTO purchaseToPurchaseDTO(Purchase purchase);
	
	List<PurchaseDTO> purchaseListToDTOList(List<Purchase> purchaseList);
}