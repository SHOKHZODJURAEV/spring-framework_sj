package dono.daryo.controller;

import dono.daryo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping( value = "/registration", method = RequestMethod.GET)
    public String showForm(Model model){

        model.addAttribute("employee", new Employee());
        List<String> batchList = Arrays.asList("JD1", "JD2", "EU1", "EU2", "B18", "B20");
        model.addAttribute("batchList", batchList);


        return "employee/employee-registration";

    }
    @RequestMapping( value = "/confirmation", method = RequestMethod.POST)
    public String showForm2(@ModelAttribute("employee") Employee employee, Model model){

        System.out.println(employee.toString());
        return "employee/employee-confirmation";
    }



}
