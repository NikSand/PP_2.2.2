package web.Service;

import web.Car.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService{



    public static List <Car> showCars(List <Car> carList, int number) {

        switch (number) {
            case (1):
                carList.subList(1,5).clear();
                return carList;

            case (2):
                carList.subList(2,5).clear();
                return carList;

            case (3):
                carList.subList(3,5).clear();
                return carList;

            case (4):
                carList.subList(4,5).clear();
                return carList;

            default:
                return carList;
        }
    }

}
