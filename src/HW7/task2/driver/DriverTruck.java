package HW7.task2.driver;

import HW7.task2.Truck;

import java.util.Objects;

public class DriverTruck extends Driver<Truck> {
    public DriverTruck(String name, String  driversLicense, Double drivingExperience) {
        super(name, driversLicense, drivingExperience);
    }


    @Override
    public void startMove(Truck transport) {
        System.out.println("Водитель " + getName() + " участвует в заезде. Начал движение на грузовике "
                + transport.getBrand() + " " + transport.getModel() + ".");
    }

    @Override
    public void stopMove(Truck transport) {
        System.out.println("Водитель " + getName() + " приехал на грузовике " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getName() + " заправил грузовик " + transport.getBrand() + " "
                + transport.getModel() + "." );
    }

    @Override
    public void checkDriversLicense() {
        if (getDriversLicense() == null || getDriversLicense().isBlank() || !Objects.equals(getDriversLicense(), "C")){
            throw new RuntimeException("Необходимо указать тип прав!");
        } else {
            System.out.println("Категория прав у водителя " + getName() + " соответствует.");
        }
    }


}
