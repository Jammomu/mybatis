package com.mysite.sbbmybatis;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public User getUser(String username) {
		return userMapper.getUserByUsername(username);
//		User user1 = new User();
//		user1.setId(1);
//		user1.setUsername(username);
//		user1.setPsw(psw);
//		LocalDateTime now = LocalDateTime.now();
//		user1.setCreateAt(now);
//		user1.setUpdateAt(now);
//		
//		return user1;
	}
}
