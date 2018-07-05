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
SessionFactory s;
	public List<JobDetail> list() {
		// TODO Auto-generated method stub
		return s.getCurrentSession().createCriteria(JobDetail.class).list();
	}

	public JobDetail getid(int i) {
		// TODO Auto-generated method stub
		return s.getCurrentSession().get(JobDetail.class, i);
	}

	public JobDetail getname(String name) {
		// TODO Auto-generated method stub
		return (JobDetail) s.getCurrentSession().createCriteria(JobDetail.class).add(Restrictions.eqOrIsNull("company", name)).uniqueResult();
	}

	public boolean add(JobDetail b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().save(b);
		return true;
	}

	public boolean update(JobDetail b) {
		s.getCurrentSession().update(b);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean delete(JobDetail b) {
		// TODO Auto-generated method stub
		s.getCurrentSession().delete(b);
		return true;
	}

}
