package com.springboot_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_rest_api.entity.PurchageOrderHeader;
import com.springboot_rest_api.entity.PurchaseOrderLineItem;
import com.springboot_rest_api.service.LineItemService;
import com.springboot_rest_api.service_impl.ItemImpli;

@RequestMapping("/PurchaseOrderLineItem")
@RestController
public class ItemController {

	@Autowired
	private LineItemService itemService;
	
	@GetMapping("/all")
	public List<PurchaseOrderLineItem> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/by/{Po_Id}")
	public PurchaseOrderLineItem getById(@PathVariable(name = "Po_Id")Long Po_Id) {
		return itemService.getItemById(Po_Id);
	}
}
