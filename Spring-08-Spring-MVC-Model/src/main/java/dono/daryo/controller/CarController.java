package dono.daryo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info") //localhost:8080/car/info?make=Honda
    public String carInfo(@RequestParam String make, @RequestParam Integer year, Model model) { // request param can be optional.
        model.addAttribute("make", "Honda");
        model.addAttribute("year", year);

        return "car/car-info";
    }

    @RequestMapping("/test")
    public String carTest(@RequestParam(value = "make", required = false, defaultValue = "Tesla") String make, Model model){
        model.addAttribute("make", make);

        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}") // localhost:8080/car/info/Honda/2015 dynamic url end-point
    public String getCarInfo(@PathVariable String make, @PathVariable Integer year, Model model){ // path variable can not be optional
        model.addAttribute("make", make);
        model.addAttribute("year", year);

        return "car/car-info";
    }
}
