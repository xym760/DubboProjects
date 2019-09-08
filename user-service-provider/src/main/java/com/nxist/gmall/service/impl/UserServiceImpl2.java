package com.nxist.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.nxist.gmall.bean.UserAddress;
import com.nxist.gmall.service.UserService;

public class UserServiceImpl2 implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl......new...");
		// TODO Auto-generated method stub
		UserAddress address1=new UserAddress(1,"宁夏理工学院","1","Mr.XU","134324234","Y");
		UserAddress address2=new UserAddress(2,"老地方","1","Mr.XU","32434324234","N");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(address1,address2);
	}
	
}
