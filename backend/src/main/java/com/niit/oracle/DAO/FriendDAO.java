package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.Friend;
@Service

public interface FriendDAO {

 
public List<Friend> list();
public Friend getid(int id);
public Friend getname(String name);
public Friend getfriendloginname(String friendloginname);
public boolean add(Friend friend);
public boolean update(Friend friend);
public boolean delete(Friend friend);
public boolean aspectRequest(int id);



}
