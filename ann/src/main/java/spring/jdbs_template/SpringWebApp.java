package spring.jdbs_template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.jdbs_template.repository.dao.IEmployeeDao;
import spring.jdbs_template.repository.entity.Employee;

public class SpringWebApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context-web.xml");
        IEmployeeDao employeeDao = context.getBean(IEmployeeDao.class);
        Employee employee = new Employee("Ivan","Ivanov",30,10_000);
        employeeDao.upsert(employee);
    }
}
