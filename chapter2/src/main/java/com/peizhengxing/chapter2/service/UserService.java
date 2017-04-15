package com.peizhengxing.chapter2.service;

public interface UserService {

	/**
	 * 新增一个用户
	 * @param name
	 * @param age
	 */
	void create(String name,Integer age);
	
	/**
	 * 删除用户 通过名字
	 * @param name
	 */
	void deleteByName(String name);
	
	/**
	 * 获取用户总数
	 * @return
	 */
	Integer getAllUsers();
	
	/**
	 * 删除所有用户
	 * @return
	 */
	void deleteAllUsers();
}
