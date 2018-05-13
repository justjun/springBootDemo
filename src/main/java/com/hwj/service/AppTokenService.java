package com.hwj.service;

import com.hwj.domain.AppToken;

public interface AppTokenService {

	AppToken getByUserId(Integer brokerId);

}