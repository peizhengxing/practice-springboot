package com.peizhengxing.chapter2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataMultiJDBCConfig {

	@Bean(name = "primaryDataSource")
	@Qualifier("primaryDataSource")
	@ConfigurationProperties(prefix="spring.datasource.primary")
	public DataSource primaryDataSource(){
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "secondDataSource")
	@Qualifier("secondDataSource")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource.second")
	public DataSource secondDataSource(){
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="primaryTemplate")
	public JdbcTemplate primaryTemplate(@Qualifier("primaryDataSource") DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
	@Bean(name="secondTemplate")
	public JdbcTemplate secondTemplate(@Qualifier("secondDataSource") DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
}
