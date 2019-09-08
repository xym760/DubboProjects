package com.nxist.gmall.bean;

import java.io.Serializable;

public class UserAddress implements Serializable {

	private Integer id;
	private String userAddress;// �û���ַ
	private String userId;// �û�id
	private String consignee;// �ջ���
	private String phoneNum;// �绰����
	private String idDefault;// �Ƿ�ΪĬ�ϵ�ַ Y-�� N-��

	public UserAddress() {
		super();
	}

	public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum,
			String idDefault) {
		super();
		this.id = id;
		this.userAddress = userAddress;
		this.userId = userId;
		this.consignee = consignee;
		this.phoneNum = phoneNum;
		this.idDefault = idDefault;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getIdDefault() {
		return idDefault;
	}

	public void setIdDefault(String idDefault) {
		this.idDefault = idDefault;
	}

	@Override
	public String toString() {
		return "UserAddress [id=" + id + ", userAddress=" + userAddress + ", userId=" + userId + ", consignee="
				+ consignee + ", phoneNum=" + phoneNum + ", idDefault=" + idDefault + "]";
	}

}
