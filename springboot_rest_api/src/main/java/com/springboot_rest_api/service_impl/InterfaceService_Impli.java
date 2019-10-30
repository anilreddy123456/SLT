package com.springboot_rest_api.service_impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot_rest_api.dao.AsnDao;
import com.springboot_rest_api.entity.Asn;
import com.springboot_rest_api.service.InterfaceService;

public class InterfaceService_Impli implements InterfaceService {

	@Autowired
	private AsnDao asnDao;
	@Override
	public Asn saveAsn(Asn asn) {
		
		Asn asnObj= new Asn();
		asnObj.setAsn_Id(100);
		asnObj.setAsn_Name("mobile");
		asnObj.setAsn_Status("suceess");
		
		Asn asnObj1= new Asn();
		asnObj1.setAsn_Id(200);
		asnObj1.setAsn_Name("laptop");
		asnObj1.setAsn_Status("failure");
		
		List<Asn> list= new ArrayList<>();
		list.add(asnObj);
		list.add(asnObj1);
		
		return asnDao.save(asn);
	}

	@Override
	public List<Asn> getAllAsnList() {
		
		return asnDao.findAll();
	}

}
