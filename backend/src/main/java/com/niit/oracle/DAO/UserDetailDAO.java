package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.UserDetail;
@Service
public interface UserDetailDAO {


	 
public List<UserDetail> list();
public UserDetail getid(int id);
public UserDetail getname(String name);
public UserDetail getloginname(String loginname);

public boolean add(UserDetail userdetail);
public boolean update(UserDetail userdetail);
public boolean delete(UserDetail userdetail);



}
