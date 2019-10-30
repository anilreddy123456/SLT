package com.springboot_rest_api.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_rest_api.dao.ItemDao;
import com.springboot_rest_api.entity.PurchaseOrderLineItem;
import com.springboot_rest_api.service.LineItemService;

@Service
public class ItemImpli implements LineItemService {

	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<PurchaseOrderLineItem> getAllItems() {
		return itemDao.findAll();
	}

	@Override
	public PurchaseOrderLineItem getItemById(Long Po_Id) {
		return itemDao.getOne(Po_Id);
	}

}
