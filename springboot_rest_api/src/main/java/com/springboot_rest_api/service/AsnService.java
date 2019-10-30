package com.springboot_rest_api.service;

import org.springframework.stereotype.Service;

import com.springboot_rest_api.entity.Asn;

@Service
public interface AsnService {

	Asn saveData(Asn asn);
}
