package web.config.Dao;

import web.config.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCars(int count);

}