package com.niit.oracle.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.ForumComment;
@Repository("forumcommentdao")
@Transactional
public class ForumCommentImp implements ForumCommentDAO{
@Autowired
SessionFactory sessionFactory; 
	public List<ForumComment> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(ForumComment.class).list();
	}

	public ForumComment getid(int i) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(ForumComment.class,i);
	}

	public ForumComment getname(String name) {
		// TODO Auto-generated method stub
		return (ForumComment) sessionFactory.getCurrentSession().createCriteria(ForumComment.class).add(Restrictions.eqOrIsNull("loginname", name)).uniqueResult();
	}

	public boolean add(ForumComment b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(b);
		return true;
	}

	public boolean update(ForumComment b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(b);
		return true;
	}

	public boolean delete(ForumComment b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(b);
		return true;
	}

}
