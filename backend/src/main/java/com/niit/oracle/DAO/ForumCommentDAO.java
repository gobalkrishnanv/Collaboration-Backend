package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.ForumComment;
@Service

public interface ForumCommentDAO {

public List<ForumComment> list();
public ForumComment getid(int i);
public ForumComment getname(String name);
public boolean add(ForumComment b);
public boolean update(ForumComment b);
public boolean delete(ForumComment b);

}
