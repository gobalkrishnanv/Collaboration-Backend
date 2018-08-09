package com.niit.oracle.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;

@Entity
public class BlogComment {
@Id
@SequenceGenerator(name="blogcommentidseq",sequenceName="blogcommentidseq")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="blogcommentidseq")
@NonNull private int commentid;
@NonNull private int blogid;
@NonNull private String commenttext;
@NonNull private String loginname;
@NonNull private Date commentdate;
@NonNull private String blogname;
public int getCommentid() {
	return commentid;
}
public void setCommentid(int commentid) {
	this.commentid = commentid;
}
public int getBlogid() {
	return blogid;
}
public void setBlogid(int blogid) {
	this.blogid = blogid;
}
public String getCommenttext() {
	return commenttext;
}
public void setCommenttext(String commenttext) {
	this.commenttext = commenttext;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public Date getCommentdate() {
	return commentdate;
}
public void setCommentdate(Date commentdate) {
	this.commentdate = commentdate;
}
public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("["+"Blog Comment Id="+getCommentid()+": \n"+"Blog id="+getBlogid()+": \n"+"Login Name="+getLoginname()+": \n"+"BlogCommentText="+getCommenttext()+": \n"+"Comment Date="+getCommentdate()+"]");
    return s.toString();
 }
public String getBlogname() {
	return blogname;
}
public void setBlogname(String blogname) {
	this.blogname = blogname;
}
}
