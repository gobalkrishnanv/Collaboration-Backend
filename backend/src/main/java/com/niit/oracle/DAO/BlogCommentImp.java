package com.niit.oracle.DAO;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.BlogComment;


@Repository("blogcommentdaos")
@Transactional
public class BlogCommentImp implements BlogCommentDAO {
@Autowired
SessionFactory s;
	public List<BlogComment> list() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createCriteria(BlogComment.class).list();
	}

	public BlogComment getid(int i) {
		// TODO Auto-generated method stub
		return s.getCurrentSession().get(BlogComment.class, i);
	}

	public BlogComment getname(String name) {
		// TODO Auto-generated method stub
		return (BlogComment) s.getCurrentSession().createCriteria(BlogComment.class).add(Restrictions.eqOrIsNull("loginname", name)).uniqueResult();
	}

	public boolean add(BlogComment b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(b);
		return true;
	}

	public boolean update(BlogComment b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(b);
		return true;
	}

	public boolean delete(BlogComment b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().delete(b);
		return true;
	}

}