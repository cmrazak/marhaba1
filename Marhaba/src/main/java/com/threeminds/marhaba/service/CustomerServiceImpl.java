package com.threeminds.marhaba.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Map<String, String> getRegionList() {

		Map<String, String> region = new LinkedHashMap<String, String>();
		region.put("DXB", "Dubai");
		region.put("SHJ", "Sharja");
		return region;
	}
}
