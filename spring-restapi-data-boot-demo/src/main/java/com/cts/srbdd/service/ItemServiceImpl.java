package com.cts.srbdd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.srbdd.entity.Item;
import com.cts.srbdd.repo.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService  {

	@Autowired
	ItemRepo itemRepo;
	
	@Override
	public Item add(Item item) {
		item = itemRepo.save(item);
		return item;
	}

	@Override
	public Item update(Item item) {
	     if(itemRepo.existsById(item.getItemId()))
	    	 item = itemRepo.save(item);
		return item;
	}

	@Override
	public void delete(long itemId) {
		itemRepo.deleteById(itemId);;
		
	}

	@Override
	public Item getItem(long itemId) {
		return itemRepo.findById(itemId).orElse(null);
			 
	}

	@Override
	public List<Item> getAll() {
		return itemRepo.findAll();
		
	}
}
