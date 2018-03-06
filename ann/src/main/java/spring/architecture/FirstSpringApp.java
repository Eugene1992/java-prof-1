package spring.architecture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import spring.architecture.controller.EmployeeControllerImpl;
import spring.architecture.controller.IEmployeeController;
import spring.architecture.repository.EmployeeRepositoryImpl;
import spring.architecture.repository.IEmployeeRepository;
import spring.architecture.service.EmployeeServiceImpl;
import spring.architecture.service.IEmployeeService;

public class FirstSpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("E:\\JavaDeveloper\\IdeaProjects\\java-prof-1\\ann\\src\\main\\resources\\context.xml");
        IEmployeeController controller = context.getBean("controller", EmployeeControllerImpl.class);
        controller.getInfo();

        IEmployeeService service = context.getBean("service", EmployeeServiceImpl.class);
        service.getInfo();

        IEmployeeRepository repository = context.getBean("repository", EmployeeRepositoryImpl.class);
        repository.getInfo();

    }
}
