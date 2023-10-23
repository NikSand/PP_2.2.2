package web.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

import static web.service.CarServiceImp.showCars;


@Controller
public class CarController {

    @Autowired
    private  CarServiceImp carServiceImp;


    @GetMapping(value = "/cars")
    public String printWelcome(Model model, @RequestParam (defaultValue = "5") int count) {


        model.addAttribute("cars", carServiceImp.showCars(count));

        return "cars";
    }

}

