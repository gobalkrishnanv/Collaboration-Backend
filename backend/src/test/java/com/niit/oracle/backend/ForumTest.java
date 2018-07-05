package com.niit.oracle.backend;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.oracle.DAO.ForumDAO;
import com.niit.oracle.config.ApplicationContext;
import com.niit.oracle.model.BlogComment;
import com.niit.oracle.model.Forum;
import com.niit.oracle.model.ForumComment;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class ForumTest {
@Autowired
ForumDAO forumdao;
Forum forum;
@Test
public void addforum() {
	forum=new Forum();
	forum.setForumid(1);
	forum.setForumname("gobalkrishnan");
	forum.setForumcontent("superman");
    forum.setLoginname("GobalKrishnan");
    forum.setStatus("A");
    assertEquals(true, forumdao.add(forum));

}

@Ignore
@Test
public void findforumbyid() {
	Forum forum=forumdao.getid(1);
	System.out.println(forum);
}

@Ignore
@Test
public void updateforum() {
	
	forum.setForumid(1);
	forum.setForumname("Spidman");
	forum.setForumcontent("Save the people in danger");
    forum.setLoginname("Peter Parker");
    forum.setStatus("A");
    assertEquals(true, forumdao.update(forum));

}

@Ignore
@Test
public void deleteforum() {
	
	
    assertEquals(true, forumdao.delete(forum));

}

@Ignore
@Test
public void listforum() {
	List<Forum> forumlist=forumdao.list();
	for(Forum forum:forumlist) {
		System.out.println(forum);
	}
	
}


}
