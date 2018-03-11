package spring.jdbs_template.repository.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import spring.jdbs_template.repository.dao.IEmployeeDao;
import spring.jdbs_template.repository.dao.ImplIEmployeeDao;

import java.net.URISyntaxException;

@Configuration
public class AppConfiguration {
    @Bean
    public BasicDataSource dataSource() throws URISyntaxException {


        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:postgresql://ec2-54-75-244-248.eu-west-1.compute.amazonaws.com:5432/d97hhdkb3s8q8f");
        basicDataSource.setUsername("wlnlgfhsqounqi");
        basicDataSource.setPassword("baa043b6b355462bb5951e0518f593b18cb24235b4bf777ae02ab2e50b37da26");
        basicDataSource.addConnectionProperty("ssl", "true");
        basicDataSource.addConnectionProperty("sslfactory", "org.postgresql.ssl.NonValidatingFactory");

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
