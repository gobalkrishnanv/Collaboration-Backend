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

import com.niit.oracle.DAO.ForumCommentDAO;
import com.niit.oracle.config.ApplicationContext;
import com.niit.oracle.model.BlogComment;
import com.niit.oracle.model.ForumComment;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class ForumCommentTest {
@Autowired
ForumCommentDAO forumcommentdao;
ForumComment forumcomment;

@Test
public void addforumcomment() {
	forumcomment=new ForumComment();
	forumcomment.setForumid(1);
	forumcomment.setCommentid(1);
	forumcomment.setDiscussionDate(new Date());
	forumcomment.setDiscussiontext("how are you?");
	forumcomment.setLoginname("Gobal Krishnan");
    assertEquals(true, forumcommentdao.add(forumcomment));
}

@Ignore
@Test
public void findforumcommentbyid() {
	ForumComment forumcomment=forumcommentdao.getid(1);
	System.out.println(forumcomment);
}

@Ignore
@Test
public void updateforumcomment() {
	forumcomment=new ForumComment();
	forumcomment.setForumid(1);
	forumcomment.setCommentid(1);
	forumcomment.setDiscussionDate(new Date());
	forumcomment.setDiscussiontext("Marvel");
	forumcomment.setLoginname("X men");
    assertEquals(true, forumcommentdao.update(forumcomment));
}

@Ignore
@Test
public void deleteforumcomment() {
	assertEquals(true, forumcommentdao.delete(forumcomment));
}

@Ignore
@Test
public void listforumcomment() {
	List<ForumComment> forumcommentlist=forumcommentdao.list();
	for(ForumComment forumcomment:forumcommentlist) {
		System.out.println(forumcomment);
	}
	
}


}
