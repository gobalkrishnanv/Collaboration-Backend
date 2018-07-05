package com.niit.oracle.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;
@Entity
public class JobDetail {
@Id
@SequenceGenerator(name="jobidseq",sequenceName="jobidseq")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="jobidseq")
private int jobid;
@NonNull private String designation;
@NonNull private String role;
@NonNull private String response;
@NonNull private String company;
@NonNull private Date lastdate;
@NonNull private String location;
@NonNull private int ctc;
@NonNull private String skill;
public int getJobid() {
	return jobid;
}
public void setJobid(int jobid) {
	this.jobid = jobid;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getResponse() {
	return response;
}
public void setResponse(String response) {
	this.response = response;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public Date getLastdate() {
	return lastdate;
}
public void setLastdate(Date lastdate) {
	this.lastdate = lastdate;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getCtc() {
	return ctc;
}
public void setCtc(int ctc) {
	this.ctc = ctc;
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}

public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("[Job Id="+jobid+": \n Designation="+designation+": \n Role="+role+": \n Response="+response+": \n Company="+company+": \n Last Date="+lastdate+": \n Location="+location+": \n CTC="+ctc+": \n Skill="+skill+"]");
    return s.toString();
 }

}
