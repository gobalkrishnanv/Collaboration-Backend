package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.ForumComment;
@Service

public interface ForumCommentDAO {

public List<ForumComment> list();
public ForumComment getid(int id);
public ForumComment getname(String name);
public boolean add(ForumComment forumcomment);
public boolean update(ForumComment forumcomment);
public boolean delete(ForumComment forumcomment);

}
