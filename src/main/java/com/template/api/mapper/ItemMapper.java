package com.template.api.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.template.api.dto.ItemDTO;
import com.template.api.entity.Item;

@Mapper
public interface ItemMapper {
	ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

	Item itemResponseDTOtoItem(ItemDTO item);
	ItemDTO itemToItemResponseDTO(Item item);
	List<ItemDTO> itemListToItemDTOList(List<Item> itemList);
}