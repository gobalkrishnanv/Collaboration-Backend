package com.niit.oracle.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.Blog;
import com.niit.oracle.model.BlogComment;
@Repository("blogdao")
@Transactional
public class BlogImp implements BlogDAO {
@Autowired
SessionFactory sessionFactory; 
	public List<Blog> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Blog.class).list();
}

	public Blog getid(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Blog.class, id);
	}

	public boolean add(Blog b) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(b);
		
		return true;
	}

	public boolean delete(Blog b) {
		this.sessionFactory.getCurrentSession().delete(b);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean update(Blog b) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().update(b);
		return true;
	}



	public boolean approve(int i) {
		// TODO Auto-generated method stub
		Blog b=this.getid(i);
		b.setStatus("A");
		this.sessionFactory.getCurrentSession().update(b);

		return true;
	}

	public boolean reject(int i) {
		// TODO Auto-generated method stub
		Blog b=this.getid(i);
		b.setStatus("NA");
		this.sessionFactory.getCurrentSession().update(b);

		return true;
	}

	public boolean likes(int i) {
		// TODO Auto-generated method stub
		Blog b=this.getid(i);
		
		b.setLikes(b.getLikes()+1);
		this.sessionFactory.getCurrentSession().update(b);

		return true;
	}

	public boolean dislikes(int i) {
		// TODO Auto-generated method stub
		Blog b=this.getid(i);
        b.setDislikes(b.getDislikes()+1);
		this.sessionFactory.getCurrentSession().update(b);

		return true;
	}

	public Blog getname(String name) {
		// TODO Auto-generated method stub
		return (Blog) sessionFactory.getCurrentSession().createCriteria(Blog.class).add(Restrictions.eqOrIsNull("blogname", name)).uniqueResult();
		//return (Blog) sessionFactory.getCurrentSession().get(Blog.class,"blogname");
		
	
	}

}
