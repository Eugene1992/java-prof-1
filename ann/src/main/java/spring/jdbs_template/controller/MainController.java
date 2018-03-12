package spring.jdbs_template.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import spring.jdbs_template.repository.config.DataBaseConfig;
import spring.jdbs_template.repository.dao.IEmployeeDao;
import spring.jdbs_template.repository.entity.Employee;

import java.util.List;

@Controller
public class MainController {

    ApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConfig.class);
    IEmployeeDao employeeDao = context.getBean(IEmployeeDao.class);
    List<Employee> employeeList;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView main(ModelAndView modelAndView,
                             @RequestParam(value = "id", required = false) Integer id,
                             @RequestParam(value = "action", required = false) String action) {

        modelAndView.setViewName("employee");
        employeeList = employeeDao.getAll();
        modelAndView.addObject("employees",employeeList);
        return modelAndView;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public ModelAndView createEmployee(@ModelAttribute Employee employee, ModelAndView modelAndView){

            Integer id = employee.getId();
            if (id != null) {
                employeeList.set(id, employee);
            } else {
                employee.setId(employeeList.size());
                employeeList.add(employee);
            }
            modelAndView.addObject("employee", employeeList);
            return modelAndView;
    }

}