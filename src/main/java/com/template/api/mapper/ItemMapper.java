package com.template.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.template.api.dto.ItemDTO;
import com.template.api.dto.ItemResponseDTO;
import com.template.api.entity.Item;

@Mapper
public interface ItemMapper {
	ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);
	
	ItemDTO itemToItemDTO(Item item);
	Item itemDTOtoItem(ItemDTO item);
	ItemResponseDTO itemToItemResponseDTO(Item item);
}