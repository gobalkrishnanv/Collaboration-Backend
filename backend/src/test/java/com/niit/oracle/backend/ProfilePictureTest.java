package com.niit.oracle.backend;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.BlobProxy;
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
public void addpicture() throws FileNotFoundException, SQLException, IOException {
	picture=new ProfilePicture();
	picture.setId(1);
	picture.setLoginname("GobalKrishnanV");
	
	
	Path a=Paths.get("E:/reg.jpg");
	
	byte[] b=null;
	
	  b=Files.readAllBytes(a);
	
	  System.out.println(b.length);
	  
	  
	  
	  
	  
	  picture.setImage(BlobProxy.generateProxy(b));
	picturedao.add(picture);
	//picturedao.add("E:/reg.jpg");
	
	
	ProfilePicture as=picturedao.getid(1);
	Blob ba=as.getImage();
	InputStream t=ba.getBinaryStream();
	byte[] aw=null;
	int v=0; 
	while((v=t.read())!=-1) {
	  
	  aw[v]=(byte)v;
	  System.out.println(v);
	}
	FileOutputStream sa=new FileOutputStream("E:/re.jpg");
	sa.write(aw);
	sa.close();
}




}
