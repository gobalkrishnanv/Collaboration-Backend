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

import com.niit.oracle.DAO.BlogDAO;
import com.niit.oracle.config.ApplicationContext;
import com.niit.oracle.model.Blog;
import com.niit.oracle.model.BlogComment;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class BlogTest {
@Autowired
BlogDAO blogdao;
Blog blog,b1; 
	@Test
	public void addblog() {
       blog=new Blog();
       blog.setBlogid(1);
      blog.setCreatedate(new Date());
      blog.setBlogname("gobal");
      blog.setBlogcontent("supermario");
      blog.setLoginname("knowlegde");
      blog.setLikes(1);
      blog.setDislikes(1);
      blog.setStatus("NA");
      assertEquals(true, blogdao.add(blog)); 
	
	
	
     
      
	
	} 
	
	
	@Test
	public void findbyname() {
		
		Blog blog=blogdao.getname("gobal");
		System.out.println(blog);
	}
	
	@Ignore
	@Test
	public void findBlogbyid() {
      Blog blog=blogdao.getid(1);
      System.out.println(blog); 
	}
	
	@Ignore
	@Test
	public void update() {
       
      blog.setBlogid(1);
      blog.setCreatedate(new Date());
      blog.setBlogname("robot");
      blog.setBlogcontent("it comfort human life");
      blog.setLoginname("knowlegde");
      blog.setLikes(2);
      blog.setDislikes(0);
      blog.setStatus("A");
      assertEquals(true, blogdao.update(blog)); 
	} 
	
	
	@Ignore
	@Test
	public void  deleteblog() {
		assertEquals(true, blogdao.delete(blog));
	}
	
	@Ignore
	@Test
	public void listblog() {
		List<Blog> bloglist=blogdao.list();
		for(Blog blog:bloglist) {
			System.out.println(blog);
		}
		
	}
}
