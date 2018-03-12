package spring.jdbs_template.repository.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import spring.jdbs_template.repository.dao.IEmployeeDao;
import spring.jdbs_template.repository.dao.ImplIEmployeeDao;

import java.net.URISyntaxException;


@Configuration
@PropertySource("classpath:db/database.properties")
public class DataBaseConfig {
    @Bean
    public BasicDataSource dataSource(@Autowired Environment environment) throws URISyntaxException {

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("org.postgresql.Driver");
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
    public IEmployeeDao employeeDao(@Autowired NamedParameterJdbcTemplate jdbcTemplate) {
        return new ImplIEmployeeDao(jdbcTemplate);
    }
}
