package com.hwj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hwj.domain.AppToken;
import com.hwj.mappers.AppTokenMapper;

@Service
public class AppTokenServiceImpl implements AppTokenService {
	@Autowired
	private AppTokenMapper appTokenMapper;
	
	@Override
	public AppToken getByUserId(Integer brokerId) {
		AppToken appToken = appTokenMapper.selectByUserId(brokerId);
		return appToken;
	}

}