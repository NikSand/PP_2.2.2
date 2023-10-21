package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import web.Service.CarServiceImp;


@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String printWelcome(Model model, @RequestParam (defaultValue = "5") int count) {

        model.addAttribute("cars", CarServiceImp.showCars(count));

        return "cars";
    }

}

