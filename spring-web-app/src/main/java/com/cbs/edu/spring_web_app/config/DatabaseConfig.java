package com.cbs.edu.spring_web_app.config;

import com.cbs.edu.spring_web_app.dao.EmployeeDao;
import com.cbs.edu.spring_web_app.dao.EmployeeDaoImpl;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.net.URISyntaxException;

@Configuration
@PropertySource("classpath:db/db.properties")
public class DatabaseConfig {

    @Bean
    public BasicDataSource dataSource(@Autowired Environment environment) throws URISyntaxException {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(environment.getProperty("db.url"));
        basicDataSource.setUsername(environment.getProperty("db.username"));
        basicDataSource.setPassword(environment.getProperty("db.password"));
        basicDataSource.addConnectionProperty("ssl", environment.getProperty("db.ssl"));
        basicDataSource.addConnectionProperty("sslfactory", environment.getProperty("db.sslfactory"));

        return basicDataSource;
    }

    @Bean
    public NamedParameterJdbcTemplate jdbcTemplate(@Autowired BasicDataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

    @Bean
    public EmployeeDao employeeDao(@Autowired NamedParameterJdbcTemplate jdbcTemplate) {
        return new EmployeeDaoImpl(jdbcTemplate);
    }
}
