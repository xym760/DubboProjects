package com.nxist.gmall.service;

import java.util.List;

import com.nxist.gmall.bean.UserAddress;

public class UserServiceStub implements UserService {

	private final UserService userService;

	/**
	 * 传入的是userService远程的代理对象
	 * 
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceStub........");
		if (userId!=null&&!userId.equals("")) {
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}
