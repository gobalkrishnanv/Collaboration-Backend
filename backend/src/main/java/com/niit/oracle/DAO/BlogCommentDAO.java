package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.BlogComment;
@Service
public interface BlogCommentDAO {
public List<BlogComment> list();
public BlogComment getid(int i);
public BlogComment getname(String name);
public boolean add(BlogComment b);
public boolean update(BlogComment b);
public boolean delete(BlogComment b);
}
