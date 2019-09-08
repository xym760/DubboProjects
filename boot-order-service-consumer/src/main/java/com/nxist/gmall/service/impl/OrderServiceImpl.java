package com.nxist.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.nxist.gmall.bean.UserAddress;
import com.nxist.gmall.service.OrderService;
import com.nxist.gmall.service.UserService;

@Service
public class OrderServiceImpl implements OrderService {

	//@Autowired
	@Reference(loadbalance = "random",timeout = 1000)
	UserService userService;

	@HystrixCommand(fallbackMethod = "hello") //一旦调用方法出错，就会调用hello方法，用hello方法容错
	@Override
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("用户id:"+userId);
		// 查询用户的收获地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		return addressList;
	}
	
	public List<UserAddress> hello(String userId) {
		
		return Arrays.asList(new UserAddress(10, "测试地址", "1", "测试", "测试", "Y"));
		
	}

}
