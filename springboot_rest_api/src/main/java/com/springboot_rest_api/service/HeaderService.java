package com.springboot_rest_api.service;

import java.util.List;

import com.springboot_rest_api.entity.PurchageOrderHeader;

public interface HeaderService {

	List<PurchageOrderHeader> getAllPOs();

	PurchageOrderHeader getById(Long PONumber);
}
