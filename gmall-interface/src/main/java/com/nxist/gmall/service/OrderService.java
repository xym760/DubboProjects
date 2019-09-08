package com.nxist.gmall.service;

import java.util.List;

import com.nxist.gmall.bean.UserAddress;

public interface OrderService {
	/**
	 * ��ʼ������
	 * 
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);
}
