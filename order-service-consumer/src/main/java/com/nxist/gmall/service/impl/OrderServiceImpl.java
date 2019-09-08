package com.nxist.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nxist.gmall.bean.UserAddress;
import com.nxist.gmall.service.OrderService;
import com.nxist.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;

	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("用户id:"+userId);
		// 查询用户的收获地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}

}
