package com.niit.oracle.backend;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.oracle.DAO.ProfilePictureDAO;
import com.niit.oracle.config.ApplicationContext;
import com.niit.oracle.model.Forum;
import com.niit.oracle.model.ProfilePicture;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=ApplicationContext.class)
public class ProfilePictureTest {
@Autowired
ProfilePictureDAO picturedao;
ProfilePicture picture;

@Test
public void addpicture() {
	picture=new ProfilePicture();
	picture.setId(1);
	picture.setLoginname("GobalKrishnan");
	assertEquals(true, picturedao.add(picture));
}

@Ignore
@Test
public void findpicturebyid() {
	ProfilePicture picture=picturedao.getid(1);
	System.out.println(picture);
}


@Ignore
@Test
public void updatepicture() {
	picture.setId(1);
	picture.setLoginname("Robot");
	assertEquals(true, picturedao.update(picture));
}

@Ignore
@Test
public void deletepicture() {
	
	assertEquals(true, picturedao.delete(picture));
}

@Ignore
@Test
public void listProfilePicture() {
	List<ProfilePicture> picturelist=picturedao.list();
	for(ProfilePicture picture:picturelist) {
		System.out.println(picture);
	}
	
}


}
