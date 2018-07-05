package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.ProfilePicture;
@Service
public interface ProfilePictureDAO {
 

public List<ProfilePicture> list();
public ProfilePicture getid(int i);
public ProfilePicture getname(String name);
public boolean add(ProfilePicture b);
public boolean update(ProfilePicture b);
public boolean delete(ProfilePicture b);


}
