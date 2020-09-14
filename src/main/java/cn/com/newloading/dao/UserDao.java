package cn.com.newloading.dao;

import org.apache.ibatis.annotations.Param;

import cn.com.newloading.bean.User;


public interface UserDao {

	public User findByUsername(@Param("username")String username);
	
}
