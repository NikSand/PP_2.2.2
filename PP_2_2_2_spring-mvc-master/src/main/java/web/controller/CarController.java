package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import web.Car.Car;
import web.Service.CarServiceImp;


import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String printWelcome(Model model, @RequestParam int count) {


        Car car1 = new Car("Toyota", "Prado", 2018);
        Car car2 = new Car("BMW", "X6", 2020);
        Car car3 = new Car("Nissan", "Patrol", 2019);
        Car car4 = new Car("Honda", "CRV", 2023);
        Car car5 = new Car("Mazda", "CX9", 2021);

        List<Car> myCars;

        {
            myCars = new ArrayList<>();
            myCars.add(car1);
            myCars.add(car2);
            myCars.add(car3);
            myCars.add(car4);
            myCars.add(car5);
        }
        model.addAttribute("cars", CarServiceImp.showCars(myCars,count));

        return "cars";
    }

}

