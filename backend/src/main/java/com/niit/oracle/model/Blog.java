package com.niit.oracle.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.lang.NonNull;

@Entity
public class Blog {

@Id	
@SequenceGenerator(name="blogidseq",sequenceName="blogidseq")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="blogidseq")
int blogid;
@NonNull private String blogname;
@NonNull private String blogcontent;
@NonNull private String loginname;
@NonNull private int likes;
@NonNull private int dislikes;
@NonNull private String status;
@NonNull private Date createdate;
public int getBlogid() {
	return blogid;
}
public void setBlogid(int blogid) {
	this.blogid = blogid;
}
public String getBlogname() {
	return blogname;
}
public void setBlogname(String blogname) {
	this.blogname = blogname;
}
public String getBlogcontent() {
	return blogcontent;
}
public void setBlogcontent(String blogcontent) {
	this.blogcontent = blogcontent;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public int getDislikes() {
	return dislikes;
}
public void setDislikes(int dislikes) {
	this.dislikes = dislikes;
}
public int getLikes() {
	return likes;
}
public void setLikes(int likes) {
	this.likes = likes;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Date getCreatedate() {
	return createdate;
}
public void setCreatedate(Date createdate) {
	this.createdate = createdate;
}

public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("["+"Blog Id="+getBlogid()+": \n"+"Blog Name="+getBlogname()+": \n"+"Blog Content="+getBlogcontent()+": \n"+"Login Name="+getLoginname()+": \n"+"Likes="+getLikes()+": \n"+"Dislikes="+getDislikes()+": \n"+"Date="+getCreatedate()+": \n"+"Status="+getStatus()+"]");
    return s.toString();
 }

}
