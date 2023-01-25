package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao{
    @Override
    public List<Car> returnCars(int count) {
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("Vaz 2109", 79, "Silver");
        Car car2 = new Car("Hyundai Getz", 95, "Gray");
        Car car3 = new Car("Chevrolet Niva", 80, "Red");
        Car car4 = new Car("Hyundai Solaris", 123, "Orange");
        Car car5 = new Car("Hyundai Solaris", 123, "Black");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        count = (count >= 0) ? count : 5;
        return carList.stream().limit(count).toList();
    }
}
