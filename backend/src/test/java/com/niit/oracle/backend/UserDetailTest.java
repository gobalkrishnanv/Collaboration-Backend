package com.niit.oracle.backend;


import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.oracle.DAO.UserDetailDAO;
import com.niit.oracle.config.ApplicationContext;
import com.niit.oracle.model.Forum;
import com.niit.oracle.model.UserDetail;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class UserDetailTest {
@Autowired
UserDetailDAO userdao;
UserDetail user;
@Test
public void adduser() {
	user=new UserDetail();
	user.setId(1);
	user.setLoginname("GobalKrishnan");
	user.setEmailid("gobal1995@gmail.com");
	user.setRegister(new Date());
	user.setMobile("8148729703");
	user.setPassword("123");
	user.setRole("ROLE_USER");
	user.setUsername("GobalKrishnan");
	user.setAddress("abc");
	assertEquals(true,userdao.add(user));
}

@Ignore
@Test
public void finduserbyid() {
	UserDetail user=userdao.getid(1);
	System.out.println(user);
}

@Ignore
@Test
public void updateuser() {
	
	user.setId(1);
	user.setLoginname("Xmen");
	user.setEmailid("xmen@gmail.com");
	user.setRegister(new Date());
	user.setMobile("1234567890");
	user.setPassword("xmen");
	user.setRole("ROLE_ADMIN");
	user.setUsername("X men");
	user.setAddress("xyz");

	assertEquals(true,userdao.update(user));
}

@Ignore
@Test
public void deleteuser() {
	
	assertEquals(true,userdao.delete(user));
}

@Ignore
@Test
public void userlist() {
	List<UserDetail> userlist=userdao.list();
	for(UserDetail user:userlist) {
		System.out.println(user);
	}
	
}
	
}
