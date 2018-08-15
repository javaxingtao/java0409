package com.offcn.service;

import javax.ws.rs.Path;

import com.offcn.pojo.Mobile;

public interface MobileService {

	
    Mobile query(Integer number);

	
}
