package com.template.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.template.api.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}