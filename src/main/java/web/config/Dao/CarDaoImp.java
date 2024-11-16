package web.config.Dao;

import org.springframework.stereotype.Component;
import web.config.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao {

    private final List<Car> cars;

    public CarDaoImp() {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota Corolla", 2020));
        cars.add(new Car(2, "Honda Accord", 2019));
        cars.add(new Car(3, "Ford Focus", 2018));
        cars.add(new Car(4, "Chevrolet Malibu", 2021));
        cars.add(new Car(5, "Nissan Altima", 2022));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}