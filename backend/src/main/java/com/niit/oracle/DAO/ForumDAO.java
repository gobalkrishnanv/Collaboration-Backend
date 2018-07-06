package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.Blog;
import com.niit.oracle.model.Forum;
@Service

public interface ForumDAO {

public List<Forum> list();
public Forum getid(int id);
public Forum getname(String name);
public boolean add(Forum forum);
public boolean update(Forum forum);
public boolean delete(Forum forum);
public boolean approve(int id);
public boolean reject(int id);
public boolean likes(int id);
public boolean dislikes(int id);

}
