package com.niit.oracle.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.ProfilePicture;
@Repository("profilepicturedao")
@Transactional
public class ProfilePictureImp implements ProfilePictureDAO{
@Autowired
SessionFactory s;
	public List<ProfilePicture> list() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createCriteria(ProfilePicture.class).list();
	}

	public ProfilePicture getid(int i) {
		// TODO Auto-generated method stub
		return s.getCurrentSession().get(ProfilePicture.class, i);
	}

	public ProfilePicture getname(String name) {
		// TODO Auto-generated method stub
		return (ProfilePicture) s.getCurrentSession().createCriteria(ProfilePicture.class).add(Restrictions.eqOrIsNull("loginname", name));
	}

	public boolean add(ProfilePicture b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(b);
		return true;
	}

	public boolean update(ProfilePicture b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().update(b);
		return true;
	}

	public boolean delete(ProfilePicture b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().detach(b);
		return true;
	}

}
