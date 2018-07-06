package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.Blog;


public interface BlogDAO {
public List<Blog> list();
public Blog getid(int id);
public Blog getname(String name);
public boolean add(Blog blog);
public boolean delete(Blog blog);
public boolean update(Blog blog);
public boolean approve(int id);
public boolean reject(int id);
public boolean likes(int id);
public boolean dislikes(int id);
}
