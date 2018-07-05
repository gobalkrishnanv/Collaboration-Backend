package com.niit.oracle.backend;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.oracle.DAO.FriendDAO;
import com.niit.oracle.config.ApplicationContext;
import com.niit.oracle.model.Forum;
import com.niit.oracle.model.ForumComment;
import com.niit.oracle.model.Friend;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class FriendTest {
@Autowired
FriendDAO frienddao;
Friend friend;
@Test
public void addfriend() {
	friend=new Friend();
	friend.setFriendid(1);
	friend.setFriendloginname("Robot");
	friend.setLoginname("Gobal Krishnan");
	friend.setStatus("A");
	assertEquals(true,frienddao.add(friend));
}

@Ignore
@Test
public void findfriendbyid() {
	Friend friend=frienddao.getid(1);
	System.out.println(friend);
}


@Ignore
@Test
public void updatefriend() {
	
	friend.setFriendid(1);
	friend.setFriendloginname("Gobal Krishnan");
	friend.setLoginname("Super Nova");
	friend.setStatus("A");
	assertEquals(true,frienddao.update(friend));
}

@Ignore
@Test
public void deletefriend() {
	assertEquals(true,frienddao.delete(friend));
}

@Ignore
@Test
public void listfriend() {
	List<Friend> friendlist=frienddao.list();
	for(Friend friend:friendlist) {
		System.out.println(friend);
	}
	
}

}
