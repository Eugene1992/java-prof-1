package com.cbs.java.database_interaction.dao;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
public class MainConfig {

    @Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        String dbUrl = "jdbc:postgresql://" + "ec2-54-75-231-195.eu-west-1.compute.amazonaws.com" + ':' + "5432" + "/dhbactqe5p1j4";

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername("afovdtnoicigvz");
        basicDataSource.setPassword("5d5cd98f00a9ce156162338ce60ca00936f0b79df74e9a672a93bcfe776f935a");
        basicDataSource.addConnectionProperty("ssl", "true");
        basicDataSource.addConnectionProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");

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
