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

import com.niit.oracle.DAO.BlogCommentDAO;
import com.niit.oracle.config.ApplicationContext;
import com.niit.oracle.model.BlogComment;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class BlogCommentTest {
@Autowired
BlogCommentDAO blogcommentdao;
BlogComment blogcomment;
	@Test
	public void addblogcomment() {
		blogcomment=new BlogComment();
		blogcomment.setBlogid(1);
		blogcomment.setCommentdate(new Date());
		blogcomment.setCommentid(1);
		blogcomment.setCommenttext("super woo!");
		blogcomment.setLoginname("gobalkrishnan");
		assertEquals(true, blogcommentdao.add(blogcomment));
	}
	
	@Ignore
	@Test
	public void findCommentbyId() {
		BlogComment blogComment=blogcommentdao.getid(1);
		System.out.println(blogComment);
	}
	
	
	@Ignore
	@Test
	public void updateblogcomment() {
		
		blogcomment.setBlogid(1);
		blogcomment.setCommentdate(new Date());
		blogcomment.setCommentid(1);
		blogcomment.setCommenttext("super hero save the world!");
		blogcomment.setLoginname("superman");
		assertEquals(true, blogcommentdao.add(blogcomment));
	}
	
	@Ignore
	@Test
	public void  deleteblogcomment() {
		assertEquals(true, blogcommentdao.delete(blogcomment));
	}
	
	@Ignore
	@Test
	public void listcomment() {
		List<BlogComment> blogcommentlist=blogcommentdao.list();
		for(BlogComment blogcomment:blogcommentlist) {
			System.out.println(blogcomment);
		}
		
	}
	
	
	
}
