package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.UserDetail;
@Service
public interface UserDetailDAO {


	 
public List<UserDetail> list();
public UserDetail getid(int i);
public UserDetail getname(String name);
public UserDetail getloginname(String name);

public boolean add(UserDetail b);
public boolean update(UserDetail b);
public boolean delete(UserDetail b);



}
