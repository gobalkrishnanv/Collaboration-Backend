package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.Friend;
@Service

public interface FriendDAO {

 
public List<Friend> list();
public Friend getid(int i);
public Friend getname(String name);
public boolean add(Friend b);
public boolean update(Friend b);
public boolean delete(Friend b);


}
