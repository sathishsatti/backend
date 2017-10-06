package com.niit.config;

import javax.sql.DataSource;
import java.util.Properties;
import org.hibernate.SessionFactory;
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
		
		@Bean(name="SessionFactory")
		public SessionFactory getessionFactory()
		{
			Properties hibernateProperties=new Properties();
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect");
			
			LocalSessionFactoryBuilder localSessionFacBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
			localSessionFacBuilder.addProperties(hibernateProperties);
			SessionFactory SessionFactory=localSessionFacBuilder.buildSessionFactory();
			return SessionFactory;
		}

	
		//TRANSACTION BEAN OBJECT
		
		@Bean
		public HibernateTransactionManager getHibernateTransactionManager(SessionFactory SessionFactory) 
		{
			HibernateTransactionManager hibernateTranMgr=new HibernateTransactionManager();
					return hibernateTranMgr;
		}
		
		
}
