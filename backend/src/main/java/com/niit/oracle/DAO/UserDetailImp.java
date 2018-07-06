package com.niit.oracle.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.UserDetail;
@Repository("userdetaildao")
@Transactional
public class UserDetailImp implements UserDetailDAO{
@Autowired
SessionFactory sessionFactory; 

	public List<UserDetail> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(UserDetail.class).list();
	}

	public UserDetail getid(int i) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(UserDetail.class, i);
	}

	public UserDetail getname(String name) {
		// TODO Auto-generated method stub
		return (UserDetail) sessionFactory.getCurrentSession().createCriteria(UserDetail.class).add(Restrictions.eqOrIsNull("username", name)).uniqueResult();
	}

	public boolean add(UserDetail b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(b);
		return true;
	}

	public boolean update(UserDetail b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(b);
		return true;
	}

	public boolean delete(UserDetail b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(b);
		return true;
	}

	public UserDetail getloginname(String name) {
		// TODO Auto-generated method stub
		return (UserDetail) sessionFactory.getCurrentSession().createCriteria(UserDetail.class).add(Restrictions.eqOrIsNull("loginname", name)).uniqueResult();
	}

}
