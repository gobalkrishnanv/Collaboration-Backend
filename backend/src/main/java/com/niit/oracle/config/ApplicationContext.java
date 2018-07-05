package com.niit.oracle.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="com.niit.oracle")
@EnableTransactionManagement
public class ApplicationContext 
{
	@Bean(name="sessionFactory")
	@Autowired
	   public LocalSessionFactoryBean sessionFactory() {
	      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	      sessionFactory.setDataSource(dataSource());
	      sessionFactory.setPackagesToScan("com.niit.oracle.model");
	      sessionFactory.setHibernateProperties(hibernateProperties());
	 
	      return sessionFactory;
	   }
	 
	   private Properties hibernateProperties() 
	   {
		Properties properties=new Properties();
		properties.setProperty("hibernate.show_sql","true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		properties.setProperty("hibernate.hbm2ddl.auto","create");
		
		return properties;
	}

	@Bean(name="dataSource")
	
	   public DataSource dataSource() {
	      DriverManagerDataSource dataSource = new DriverManagerDataSource();
	      dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	      dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	     dataSource.setUsername("KNOWLEDGE");
	      dataSource.setPassword("123");
	 
	      return dataSource;
	   }
	 
	   @Bean(name="transactionManager")
	   @Autowired
	   public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
	   {
	
		   HibernateTransactionManager hibernateTransactionManager= new HibernateTransactionManager();
		   hibernateTransactionManager.setSessionFactory(sessionFactory);
 
		   return hibernateTransactionManager;
	   }
}