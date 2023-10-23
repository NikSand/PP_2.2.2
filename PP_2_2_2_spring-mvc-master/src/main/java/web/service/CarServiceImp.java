package web.service;






import org.springframework.stereotype.Component;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{


    public List <Car> showCars(int number) {

        Car car1 = new Car("Toyota", "Prado", 2018);
        Car car2 = new Car("BMW", "X6", 2020);
        Car car3 = new Car("Nissan", "Patrol", 2019);
        Car car4 = new Car("Honda", "CRV", 2023);
        Car car5 = new Car("Mazda", "CX9", 2021);

        List <Car> myCars;

        {
            myCars = new ArrayList<>();
            myCars.add(car1);
            myCars.add(car2);
            myCars.add(car3);
            myCars.add(car4);
            myCars.add(car5);
        }


        switch (number) {
            case (1):
                myCars.subList(1,5).clear();
                return myCars;

            case (2):
                myCars.subList(2,5).clear();
                return myCars;

            case (3):
                myCars.subList(3,5).clear();
                return myCars;

            case (4):
                myCars.subList(4,5).clear();
                return myCars;

            default:
                return myCars;
        }
    }

}
