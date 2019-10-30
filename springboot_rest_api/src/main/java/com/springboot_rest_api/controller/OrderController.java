package com.springboot_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_rest_api.entity.PurchageOrderHeader;
import com.springboot_rest_api.service.HeaderService;


@RequestMapping("/PurchageOrderHeader")
@RestController
public class OrderController {

	@Autowired
	private HeaderService headerService;

	@GetMapping("/all")
	public List<PurchageOrderHeader> getAllPOs() {
		return headerService.getAllPOs();
	}

	@GetMapping("/by/{PONumber}")
	public PurchageOrderHeader getById(@PathVariable(name = "PONumber") Long PONumber) {
		return headerService.getById(PONumber);
	}
}