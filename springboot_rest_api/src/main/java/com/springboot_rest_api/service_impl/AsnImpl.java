package com.springboot_rest_api.service_impl;

import com.springboot_rest_api.dao.AsnDao;
import com.springboot_rest_api.entity.Asn;
import com.springboot_rest_api.service.AsnService;

public class AsnImpl implements AsnService {

	private AsnDao asnDao;
	
	@Override
	public Asn saveData(Asn asn) {

		return asnDao.save(asn);
	}

}
