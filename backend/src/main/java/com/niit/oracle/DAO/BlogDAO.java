package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.Blog;


public interface BlogDAO {
public List<Blog> list();
public Blog getid(int id);
public Blog getname(String name);
public boolean add(Blog b);
public boolean delete(Blog b);
public boolean update(Blog b);
public boolean approve(int i);
public boolean reject(int i);
public boolean likes(int i);
public boolean dislikes(int i);
}
