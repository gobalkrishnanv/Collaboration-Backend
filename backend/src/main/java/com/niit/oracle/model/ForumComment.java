package com.niit.oracle.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;
@Entity
public class ForumComment {
@Id
@SequenceGenerator(name="forumcommentidseq",sequenceName="forumcommentidseq")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="forumcommentidseq")
private int commentid;
@NonNull private int forumid;
@NonNull private String discussiontext;
@NonNull private String loginname;
@NonNull private Date discussionDate;
public int getCommentid() {
	return commentid;
}
public void setCommentid(int commentid) {
	this.commentid = commentid;
}
public int getForumid() {
	return forumid;
}
public void setForumid(int forumid) {
	this.forumid = forumid;
}
public String getDiscussiontext() {
	return discussiontext;
}
public void setDiscussiontext(String discussiontext) {
	this.discussiontext = discussiontext;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public Date getDiscussionDate() {
	return discussionDate;
}
public void setDiscussionDate(Date discussionDate) {
	this.discussionDate = discussionDate;
}
public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("["+"Forum Comment Id="+commentid+": \n"+"Forum Id="+forumid+": \n"+"Discussion Text="+discussiontext+": \n"+"Login Name"+loginname+": \n"+"Discussion Date="+discussionDate+"]");
    return s.toString();
 }
}
