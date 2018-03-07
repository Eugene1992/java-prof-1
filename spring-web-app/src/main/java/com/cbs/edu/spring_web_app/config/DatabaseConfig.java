package com.cbs.edu.spring_web_app.config;

import com.cbs.edu.spring_web_app.dao.EmployeeDao;
import com.cbs.edu.spring_web_app.dao.EmployeeDaoImpl;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import java.net.URISyntaxException;
import java.util.Properties;

@Configuration
@PropertySource("classpath:db/db.properties")
//@EnableJpaRepositories(basePackages = {"com.cbs.edu.spring_web_app.dao"})
public class DatabaseConfig {

    @Autowired private Environment environment;

    @Bean
    public BasicDataSource dataSource() {
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

    /*@Bean
    public LocalSessionFactoryBean sessionFactory() throws URISyntaxException {
        final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.cbs.edu");
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean
    public EntityManagerFactory entityManagerFactory() throws URISyntaxException {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.cbs.edu");
        factory.setDataSource(dataSource());
        factory.afterPropertiesSet();

        return factory.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws URISyntaxException {

        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory());
        return txManager;
    }

    Properties hibernateProperties() {
        return new Properties() {
            {
                setProperty("hibernate.hbm2ddl.auto", "create");
                setProperty("hibernate.show_sql", "false");
                setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            }
        };
    }*/
}
