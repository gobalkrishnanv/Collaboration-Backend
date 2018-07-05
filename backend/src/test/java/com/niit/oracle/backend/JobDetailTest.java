package com.niit.oracle.backend;


import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.oracle.DAO.JobDetailDAO;
import com.niit.oracle.config.ApplicationContext;
import com.niit.oracle.model.Forum;
import com.niit.oracle.model.Friend;
import com.niit.oracle.model.JobDetail;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class JobDetailTest {

@Autowired
JobDetailDAO jobdao;
JobDetail job;

@Test 
public void addjob() {
	job=new JobDetail();
	job.setRole("A");
	job.setJobid(1);
	job.setCompany("abc");
	job.setDesignation("robot");
	job.setLastdate(new Date());
	job.setSkill("embedded");
	job.setLocation("chennai");
	job.setResponse("thread");
	job.setCtc(2);
    assertEquals(true, jobdao.add(job));

}

@Ignore
@Test
public void findjobbyid() {
	JobDetail job=jobdao.getid(1);
	System.out.println(job);
}


@Ignore
@Test                                       
public void updatejob() {                        
	               
	job.setRole("A");                       
	job.setJobid(1);                        
	job.setCompany("xyz");                  
	job.setDesignation("Graphics");            
	job.setLastdate(new Date());            
	job.setSkill("Cinema4D");               
	job.setLocation("chennai");             
	job.setResponse("selected");              
	job.setCtc(2);                          
    assertEquals(true, jobdao.update(job));    
                                            
}  
@Ignore
@Test                                       
public void deletejob() {                        
	                                      
    assertEquals(true, jobdao.delete(job));    
                                            
} 

@Ignore
@Test
public void listjob() {
	List<JobDetail> joblist=jobdao.list();
	for(JobDetail job:joblist) {
		System.out.println(job);
	}
	
}

	
}
