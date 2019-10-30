package com.springboot_rest_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot_rest_api.entity.Asn;

@Service
public interface InterfaceService {

	Asn saveAsn(Asn asn);
	
	List<Asn> getAllAsnList();
}
