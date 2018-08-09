package com.niit.oracle.model;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;

@Entity
public class ProfilePicture {
@Id
@SequenceGenerator(name="profileidseq",sequenceName="profileidseq")
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="profileidseq")
private int profileid; 
@NonNull
private String loginname;

@NonNull private Blob image;
public String getLoginname() {
	return loginname;
}

public void setLoginname(String loginname) {
	this.loginname = loginname;
}


public int getId() {
	return profileid;
}

public void setId(int id) {
	this.profileid = id;
}

public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("[Profile="+profileid+":\n Login Name="+loginname+":\n Image Stream="+image+"]");
    return s.toString();
 }

public Blob getImage() {
	return image;
}

public void setImage(Blob image) {
	this.image = image;
}	
}
