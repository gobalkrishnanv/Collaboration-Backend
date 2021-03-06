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
SessionFactory sessionFactory; 
	public List<Friend> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Friend.class).list();
	}

	public List<Friend> list(String loginname) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Friend.class).add(Restrictions.eqOrIsNull("loginname", loginname)).list();
	}
	
	public Friend getid(int i) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Friend.class, i);
	}

	public Friend getname(String name) {
		// TODO Auto-generated method stub
		return (Friend) sessionFactory.getCurrentSession().createCriteria(Friend.class).add(Restrictions.eqOrIsNull("loginname", name)).uniqueResult();
	}
     
	public Friend getfriendloginname(String friendloginname) {
		// TODO Auto-generated method stub
		return (Friend) sessionFactory.getCurrentSession().createCriteria(Friend.class).add(Restrictions.eqOrIsNull("friendloginname", friendloginname)).uniqueResult();
	}
	
	
	public boolean add(Friend b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(b);
		return true;
	}

	public boolean update(Friend b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(b);
		return true;
	}

	public boolean delete(Friend b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(b);
		return true;
	}

	public boolean aspectRequest(int id) {
		// TODO Auto-generated method stub
		Friend friend=this.getid(id);
		
		friend.setStatus("A");
		sessionFactory.getCurrentSession().update(friend);
		return true;
	}

	

	public boolean rejectRequest(int id) {
		// TODO Auto-generated method stub
		Friend friend=this.getid(id);
		friend.setFriendloginname("");
		friend.setStatus("");
		sessionFactory.getCurrentSession().update(friend);
		return true;
	}

	public boolean sendRequest(int from, int to) {
		// TODO Auto-generated method stub
		Friend f=this.getid(from);
		Friend t1=this.getid(to);
		
		Friend t=new Friend();
		t.setFriendid(t1.getFriendid());
		t.setLoginname(t1.getLoginname());
		t.setFriendloginname(f.getLoginname());
		t.setStatus("NA");
		sessionFactory.getCurrentSession().save(t);
		return true;
	}
    
	
	
	

}
