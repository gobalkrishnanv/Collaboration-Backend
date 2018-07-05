package com.niit.oracle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Friend {
 @Id
 @SequenceGenerator(name="friendidseq",sequenceName="friendidseq")
 @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="friendidseq")
 private int friendid;
 private String loginname;
 private String friendloginname;
 private String status;
public int getFriendid() {
	return friendid;
}
public void setFriendid(int friendid) {
	this.friendid = friendid;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public String getFriendloginname() {
	return friendloginname;
}
public void setFriendloginname(String friendloginname) {
	this.friendloginname = friendloginname;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}


public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("["+"Friend Id="+friendid+": \n"+"Login Name="+loginname+": \n"+"Friend Login Name="+friendloginname+": \n"+"Status="+status+"]");
    return s.toString();
 }


}
