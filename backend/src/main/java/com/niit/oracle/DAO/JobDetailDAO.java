package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.JobDetail;
@Service

public interface JobDetailDAO {


public List<JobDetail> list();
public List<JobDetail> list(String loginname);
public JobDetail getid(int id);
public JobDetail getname(String name);
public boolean add(JobDetail job);
public boolean update(JobDetail job);
public boolean delete(JobDetail job);
public boolean apply(int id);
public boolean reject(int id);


}
