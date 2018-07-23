package com.niit.oracle.backend;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.oracle.DAO.ProfilePictureDAO;
import com.niit.oracle.config.ApplicationContext;
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
	picturedao.add(picture);
}




}
