package dono.daryo.controller;

import dono.daryo.bootstrap.DataGenerator;


import dono.daryo.enums.Gender;
import dono.daryo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/register")
    public String register(Model model){
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register";
    }
    @RequestMapping("/welcome")
    public String info(){
        return "1";
    }

    @RequestMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Shawn","Juraev", 30, Gender.Male ));
        mentorList.add(new Mentor("Sabby","Singh", 30, Gender.Male ));
        mentorList.add(new Mentor("Krit","Shah", 30, Gender.Male ));

        model.addAttribute("mentors", mentorList);
        return "student/mentor";
    }
}
