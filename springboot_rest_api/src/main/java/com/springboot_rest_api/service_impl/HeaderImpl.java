package com.springboot_rest_api.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_rest_api.dao.PurchaseOrder;
import com.springboot_rest_api.entity.PurchageOrderHeader;
import com.springboot_rest_api.service.HeaderService;

@Service
public class HeaderImpl implements HeaderService {

	@Autowired
	private PurchaseOrder purchaseOrder;
	
	@Override
	public List<PurchageOrderHeader> getAllPOs() {
		return purchaseOrder.findAll();
	}

	@Override
	public PurchageOrderHeader getById(Long PONumber) {
		// TODO Auto-generated method stub
		return purchaseOrder.getOne(PONumber);
	}

	
}
