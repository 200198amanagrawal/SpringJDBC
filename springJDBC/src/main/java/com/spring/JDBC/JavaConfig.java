package com.spring.JDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


/**
 * Use this class only when config.xml is not required
 * */
@Configuration
public class JavaConfig {
	
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql:// localhost : 3306 / student_manage");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate geTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
}
