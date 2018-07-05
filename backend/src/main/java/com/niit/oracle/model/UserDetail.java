package com.niit.oracle.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;
@Entity
public class UserDetail {

@Id
@SequenceGenerator(name="userseqid",sequenceName="userseqid")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="userseqid")
private int id;	
@NonNull private String loginname;
@NonNull private String password;
@NonNull private String username;
@NonNull private String emailid;
@NonNull private String mobile;
@NonNull private String role;
@NonNull private String address;
@NonNull private Date register;
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getRegister() {
	return register;
}
public void setRegister(Date register) {
	this.register = register;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("[User Id="+id+":\n Login Name="+loginname+":\n User Name="+username+":\n Password="+password+":\n Email Id="+emailid+": \n Mobile="+mobile+"\n Role="+role+": \n Address="+address+": \n Register="+register+"]");
    return s.toString();
 }

}
