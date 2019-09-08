package com.nxist.gmall.service;

import java.util.List;

import com.nxist.gmall.bean.UserAddress;

/**
 * �û�����
 * @author YuanmaoXu
 */
public interface UserService {
	/**
	 * �����û�id�������е��ջ��ַ
	 * 
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
}
