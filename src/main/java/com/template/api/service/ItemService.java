package com.template.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.template.api.dto.ItemDTO;
import com.template.api.entity.Item;
import com.template.api.mapper.ItemMapper;
import com.template.api.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	/**
	 * Find the item with the id specified
	 * @param id
	 * @return
	 */
	public ItemDTO findById(Long id) {
		final Optional<Item> optional = this.itemRepository.findById(id);
		
		if (!optional.isPresent()) {
			return null;
		}
		
		return ItemMapper.INSTANCE.itemToItemResponseDTO(optional.get());
	}
	
	public List<ItemDTO> findAll() {
		return ItemMapper.INSTANCE.itemListToItemDTOList(this.itemRepository.findAll());
	}
	
	/**
	 * Save the specified item and return the response DTO
	 * @param itemDTO
	 * @return
	 */
	public ItemDTO save(ItemDTO itemDTO) {
		Item item = ItemMapper.INSTANCE.itemResponseDTOtoItem(itemDTO);
		
		return ItemMapper.INSTANCE.itemToItemResponseDTO(this.itemRepository.save(item));
	}
}