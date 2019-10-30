package com.springboot_rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_rest_api.entity.Asn;
import com.springboot_rest_api.service.AsnService;

@RequestMapping("/asn")
@RestController
public class AsnController {
	
	@Autowired
	private AsnService asnService;
	
	@PostMapping(path="/save",consumes = "application/json", produces = "application/json")
	public Asn save(Asn asn ) //RequestBody no need
	{
		
		return asnService.saveData(asn);
	}
}
