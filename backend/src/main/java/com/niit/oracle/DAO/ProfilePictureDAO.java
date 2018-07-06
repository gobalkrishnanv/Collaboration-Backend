package com.niit.oracle.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.oracle.model.ProfilePicture;
@Service
public interface ProfilePictureDAO {
 

public List<ProfilePicture> list();
public ProfilePicture getid(int id);
public ProfilePicture getname(String name);
public boolean add(ProfilePicture profilepicture);
public boolean update(ProfilePicture profilepicture);
public boolean delete(ProfilePicture profilepicture);


}
