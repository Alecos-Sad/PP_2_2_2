package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    private static int ID;
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(++ID,"Toyota", 2000));
        carList.add(new Car(++ID,"Lexus", 5000));
        carList.add(new Car(++ID,"Porsche", 20000));
        carList.add(new Car(++ID,"Mazda", 7000));
        carList.add(new Car(++ID,"Maserati", 50000));
    }

    @Override
    public List<Car> getCarList(){
        return carList;
    }

    @Override
    public List<Car> getCountListCar(int count){
       return getCarList().stream().limit(count).toList();
    }
}
