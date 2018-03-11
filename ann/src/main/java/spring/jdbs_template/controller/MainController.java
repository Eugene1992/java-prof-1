package spring.jdbs_template.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spring.jdbs_template.repository.config.DataBaseConfig;
import spring.jdbs_template.repository.dao.IEmployeeDao;
import spring.jdbs_template.repository.entity.Employee;

@Controller
public class MainController {

    ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConfig.class);
    IEmployeeDao employeeDao = context.getBean(IEmployeeDao.class);

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView main(ModelAndView modelAndView) {

        modelAndView.setViewName("employee");
        modelAndView.addObject(employeeDao.getAll());
        return modelAndView;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public ModelAndView createEmployee(@ModelAttribute Employee employee, ModelAndView modelAndView){
        employee.setId(employee.getId());
        employeeDao.upsert(employee);
        modelAndView.addObject("employee",employee);

        return modelAndView;
    }

}