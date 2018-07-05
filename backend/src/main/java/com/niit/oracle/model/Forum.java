package com.niit.oracle.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;
@Entity
public class Forum {
@Id
@SequenceGenerator(name="forumidseq",sequenceName="forumidseq")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="forumidseq")
private int forumid;
@NonNull private String forumname;
@NonNull private String forumcontent;
@NonNull private Date createdate;
@NonNull private String loginname;
@NonNull private String status;
@NonNull private int likes;
@NonNull private int dislikes;
public int getForumid() {
	return forumid;
}
public void setForumid(int forumid) {
	this.forumid = forumid;
}
public String getForumname() {
	return forumname;
}
public void setForumname(String forumname) {
	this.forumname = forumname;
}
public String getForumcontent() {
	return forumcontent;
}
public void setForumcontent(String forumcontent) {
	this.forumcontent = forumcontent;
}
public Date getCreatedate() {
	return createdate;
}
public void setCreatedate(Date createdate) {
	this.createdate = createdate;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("["+"Forum Id="+forumid+": \n"+"Forum Name="+forumname+": \n"+"Forum Content="+forumcontent+": \n"+"Date="+createdate+": \n"+"Login Name="+loginname+": \n"+"Status="+status+"]");
    return s.toString();
 }
public int getLikes() {
	return likes;
}
public void setLikes(int likes) {
	this.likes = likes;
}
public int getDislikes() {
	return dislikes;
}
public void setDislikes(int dislikes) {
	this.dislikes = dislikes;
}
}
