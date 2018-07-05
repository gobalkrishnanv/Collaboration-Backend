package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.Blog;
import com.niit.oracle.model.Forum;
@Service

public interface ForumDAO {

public List<Forum> list();
public Forum getid(int i);
public Forum getname(String name);
public boolean add(Forum b);
public boolean update(Forum b);
public boolean delete(Forum b);
public boolean approve(int i);
public boolean reject(int i);
public boolean likes(int i);
public boolean dislikes(int i);

}
