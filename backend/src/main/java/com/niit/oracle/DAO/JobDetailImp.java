package com.niit.oracle.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.oracle.model.JobDetail;
@Repository("jobdetaildao")
@Transactional
public class JobDetailImp implements JobDetailDAO {
@Autowired
SessionFactory sessionFactory; 
	public List<JobDetail> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(JobDetail.class).list();
	}

	public List<JobDetail> list(String loginname) {
		// TODO Auto-generated method stub
		return  sessionFactory.getCurrentSession().createCriteria(JobDetail.class).add(Restrictions.eqOrIsNull("loginname", loginname)).list();

	}
	
	public JobDetail getid(int i) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(JobDetail.class, i);
	}

	public JobDetail getname(String name) {
		// TODO Auto-generated method stub
		return (JobDetail) sessionFactory.getCurrentSession().createCriteria(JobDetail.class).add(Restrictions.eqOrIsNull("company", name)).uniqueResult();
	}

	public boolean add(JobDetail b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(b);
		return true;
	}

	public boolean update(JobDetail b) {
		sessionFactory.getCurrentSession().update(b);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean delete(JobDetail b) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(b);
		return true;
	}

	public boolean apply(int id) {
		// TODO Auto-generated method stub
		JobDetail job=this.getid(id);
		job.setResponse("A");
		sessionFactory.getCurrentSession().update(job);
		
		return true;
	}

	public boolean reject(int id) {
		// TODO Auto-generated method stub
		JobDetail job=this.getid(id);
		job.setResponse("NA");
		sessionFactory.getCurrentSession().update(job);
		
		return true;
	}

	

}
