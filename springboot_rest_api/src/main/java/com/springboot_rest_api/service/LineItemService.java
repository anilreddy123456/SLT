package com.springboot_rest_api.service;

import java.util.List;

import com.springboot_rest_api.entity.PurchageOrderHeader;
import com.springboot_rest_api.entity.PurchaseOrderLineItem;

public interface LineItemService {

	List<PurchaseOrderLineItem> getAllItems();
	
	PurchaseOrderLineItem getItemById(Long Po_Id);
}
