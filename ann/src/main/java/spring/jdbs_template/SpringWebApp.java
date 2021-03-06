package spring.jdbs_template;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.jdbs_template.repository.config.DataBaseConfig;
import spring.jdbs_template.repository.dao.IEmployeeDao;
import spring.jdbs_template.repository.entity.Employee;

public class SpringWebApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConfig.class);
        IEmployeeDao employeeDao = context.getBean(IEmployeeDao.class);
        Employee employee = new Employee(10,"I","Iv",15,10_000);
        //employeeDao.upsert(employee);
       // employeeDao.get(10);
       // employeeDao.delete(10);
        employeeDao.getAll();
       // System.out.println(employee.toString());
    }
}
