package com.niit.oracle.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.Friend;
@Repository("frienddao")
@Transactional
public class FriendImp implements FriendDAO {
@Autowired
SessionFactory s;
	public List<Friend> list() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createCriteria(Friend.class).list();
	}

	public Friend getid(int i) {
		// TODO Auto-generated method stub
		return s.getCurrentSession().get(Friend.class, i);
	}

	public Friend getname(String name) {
		// TODO Auto-generated method stub
		return (Friend) s.getCurrentSession().createCriteria(Friend.class).add(Restrictions.eqOrIsNull("friendloginname", name)).uniqueResult();
	}

	public boolean add(Friend b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(b);
		return true;
	}

	public boolean update(Friend b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(b);
		return true;
	}

	public boolean delete(Friend b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().delete(b);
		return true;
	}

}
