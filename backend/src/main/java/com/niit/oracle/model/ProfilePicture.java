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
private int id;
@NonNull
private String loginname;

@NonNull
private byte[] imagestream;
public String getLoginname() {
	return loginname;
}

public void setLoginname(String loginname) {
	this.loginname = loginname;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public byte[] getImagestream() {
	return imagestream;
}

public void setImagestream(byte[] imagestream) {
	this.imagestream = imagestream;
}
public String toString() {
	StringBuilder s=new StringBuilder();
	s.append("[Profile="+id+":\n Login Name="+loginname+":\n Image Stream="+imagestream+"]");
    return s.toString();
 }	
}
