package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.JobDetail;
@Service

public interface JobDetailDAO {


public List<JobDetail> list();
public JobDetail getid(int i);
public JobDetail getname(String name);
public boolean add(JobDetail b);
public boolean update(JobDetail b);
public boolean delete(JobDetail b);



}
