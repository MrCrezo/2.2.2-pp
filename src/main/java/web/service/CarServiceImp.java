package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.config.Dao.CarDao;
import web.config.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    private CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}