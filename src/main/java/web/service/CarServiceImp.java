package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService {

    private CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> returnCars(int count) {
        count = (count >= 0) ? count : 5;
        return carDao.returnCars(count);
    }
}
