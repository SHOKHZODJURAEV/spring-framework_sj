package dono.daryo.controller;

import dono.daryo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("Course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        // Create some random studentId(0-1000) amd show it your UI

        int studentId = new Random().nextInt();
        model.addAttribute("id", studentId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(10);
        model.addAttribute("numbers", numbers);
        Student student = new Student(1,"Shawn", "Juraev");
        model.addAttribute("student",student);
        return "student/welcome";
    }

    @RequestMapping("/task")
    public String tablePage(Model model){
        model.addAttribute("FirstName", "First Name");
        model.addAttribute("LastName", "Last Name");
        model.addAttribute("Age", "Age");
        model.addAttribute("Gender", "Gender");
        return "student/Task";
    }


}
