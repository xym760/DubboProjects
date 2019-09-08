package com.nxist.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.nxist.gmall.bean.UserAddress;
import com.nxist.gmall.service.UserService;

@Service //暴露服务，将这个类的方法暴露出去，供其他模块调用
@Component
public class UserServiceImpl implements UserService {

	@HystrixCommand //通过该注解，当方法出现异常，可以进行容错
	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl...3.....");
		UserAddress address1=new UserAddress(1,"宁夏理工学院	","1","Mr.XU","134324234","Y");
		UserAddress address2=new UserAddress(2,"老地方","1","Mr.YUAN","32434324234","N");
		/*
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		if(Math.random()>0.5) {//模拟服务不定期出现异常
			throw new RuntimeException();
		}
		return Arrays.asList(address1,address2);
	}
	
}
