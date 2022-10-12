package HW7.task2;


import HW7.task2.driver.DriverBus;
import HW7.task2.driver.DriverCar;
import HW7.task2.driver.DriverTruck;

public class Main {
    public static void main(String[] args) throws CantDiagnosticException {

        Car audi = new Car("Audi", "A8", 2.5, BodyTypeCar.SEDAN);
        Car bmw = new Car("BMW", "5s", 3.0, BodyTypeCar.CROSSOVER);
        Car kia = new Car("Kia", "S4", 1.8, BodyTypeCar.SUV);
        Car lada = new Car("Lada", "Granta", 1.6, null);
//        kia.determineTypeOfCar();
//        lada.determineTypeOfCar();
//        audi.determineTypeOfCar();
//        bmw.determineTypeOfCar();
//        System.out.println();

        Bus schoolBus = new Bus("Школьный", "Ш-1", 2.0, CapacityTypeBus.SMALL);
        Bus workBus = new Bus("Рабочий", "В-2", 1.2, null);
        Bus cityBus = new Bus("Городской", "Г-14", 3.0, CapacityTypeBus.LARGE);
        Bus touristBus = new Bus("Туристический", "Т-11", 3.5, CapacityTypeBus.ESPECIALLY_LARGE);
//        schoolBus.determineTypeOfBus();
//        touristBus.determineTypeOfBus();
//        workBus.determineTypeOfBus();
//        cityBus.determineTypeOfBus();
//        System.out.println();

        Truck kamaz = new Truck("KamAZ", "K-10", 2.6, LoadTypeTruck.N1);
        Truck zil = new Truck("ZIL", "M-2", 2.0, LoadTypeTruck.N2);
        Truck ural = new Truck("URAL", "Y-4", 3.0, LoadTypeTruck.N3);
        Truck gaz = new Truck("GAZ", "G-6", 3.0, null);
//        zil.determineTypeOfTtuck();
//        gaz.determineTypeOfTtuck();
//        kamaz.determineTypeOfTtuck();
//        ural.determineTypeOfTtuck();

        checkDiagnostic(audi, zil, gaz, cityBus);

        DriverCar vasya = new DriverCar("Вася", "B", 1.0);
        DriverTruck alesha = new DriverTruck("Алеша", "C",15.0);
        DriverBus misha = new DriverBus("Миша", "C", 7.5);

        alesha.checkDriversLicense();
    }

    public static boolean checkDiagnostic(Transport ... transports) throws CantDiagnosticException {
        int count = 1;

            try {
                for (Transport transport : transports) {
                    transport.diagnostic();
                    count++;
                }
            } catch (CantDiagnosticException e) {
                System.out.println("Обнаружена ошибка:" );
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Прошло диагностику - " + count);
            }
        return false;
    }
}
