package com.niit.oracle.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.Blog;
import com.niit.oracle.model.Forum;
import com.niit.oracle.model.Forum;

@Repository("forumdao")
@Transactional

public class ForumImp implements ForumDAO {
@Autowired
SessionFactory s;
	public List<Forum> list() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createCriteria(Forum.class).list();
	}

	public Forum getid(int i) {
		// TODO Auto-generated method stub
		return s.getCurrentSession().get(Forum.class, i);
	}

	public Forum getname(String name) {
		// TODO Auto-generated method stub
		return (Forum) s.getCurrentSession().createCriteria(Forum.class).add(Restrictions.eqOrIsNull("forumname", name)).uniqueResult();
	}

	public boolean add(Forum b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(b);
		return true;
	}

	public boolean update(Forum b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(b);
		return true;
	}

	public boolean delete(Forum b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().delete(b);
		return true;
	}

	
	public boolean approve(int i) {
		// TODO Auto-generated method stub
		Forum b=this.getid(i);
		b.setStatus("A");
		this.s.getCurrentSession().update(b);

		return true;
	}

	public boolean reject(int i) {
		// TODO Auto-generated method stub
		Forum b=this.getid(i);
		b.setStatus("NA");
		this.s.getCurrentSession().update(b);

		return true;
	}

	public boolean likes(int i) {
		// TODO Auto-generated method stub
		Forum b=this.getid(i);
		
		b.setLikes(b.getLikes()+1);
		this.s.getCurrentSession().update(b);

		return true;
	}

	public boolean dislikes(int i) {
		// TODO Auto-generated method stub
		Forum b=this.getid(i);
        b.setDislikes(b.getDislikes()+1);
		this.s.getCurrentSession().update(b);

		return true;
	}

	


}
