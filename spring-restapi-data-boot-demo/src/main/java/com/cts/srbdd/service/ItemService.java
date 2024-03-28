package com.cts.srbdd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.srbdd.entity.Item;

@Service
public interface ItemService {
	Item add(Item item);
	Item update(Item item);
	void delete(long itemId);
	Item getItem(long itemId);
	List<Item> getAll();

}
