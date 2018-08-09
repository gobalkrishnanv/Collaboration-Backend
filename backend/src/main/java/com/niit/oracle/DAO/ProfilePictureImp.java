package com.niit.oracle.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.ProfilePicture;
@Repository("profilepicturedao")
@Transactional
public class ProfilePictureImp implements ProfilePictureDAO{
@Autowired
SessionFactory sessionFactory; 
	public List<ProfilePicture> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(ProfilePicture.class).list();
	}

	
	
		
	
	
	
	public ProfilePicture getid(int i) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(ProfilePicture.class, i);
	}

	public ProfilePicture getname(String loginname) {
		// TODO Auto-generated method stub
		return (ProfilePicture) sessionFactory.getCurrentSession().get(ProfilePicture.class,loginname);
	}

	public boolean add(ProfilePicture b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(b);
		return true;
	}

	public boolean update(ProfilePicture b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(b);
		return true;
	}

	public boolean delete(ProfilePicture b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().detach(b);
		return true;
	}

	

}
