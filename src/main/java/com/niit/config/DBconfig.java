package com.niit.config;

import javax.sql.DataSource;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit")
public class DBconfig 
{
	
		//creating a dataSource bean
		public DataSource getH2DataSource()
	{
		DriverManagerDataSource driverMgrDataSource=new DriverManagerDataSource("org.h2.Driver");
		driverMgrDataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
		driverMgrDataSource.setUsername("sa");
		driverMgrDataSource.setPassword("");
		return driverMgrDataSource;
	}
		//SessionFactory bean created
		@Autowired
		@Bean(name="SessionFactory")
		public SessionFactory getSessionFactory()
		{
			Properties hibernateProperties=new Properties();
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			
			LocalSessionFactoryBuilder localSessionFacBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
			localSessionFacBuilder.addProperties(hibernateProperties);
			localSessionFacBuilder.scanPackages("com.niit.*");
			SessionFactory SessionFactory=localSessionFacBuilder.buildSessionFactory();
			return SessionFactory;
		}

	
		//TRANSACTION BEAN OBJECT
		@Autowired
		@Bean
		public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) 
		{
			HibernateTransactionManager hibernateTranMgr=new HibernateTransactionManager(sessionFactory);
					return hibernateTranMgr;
		}
		
		
}
