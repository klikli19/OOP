package HW6;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8", 2.5,BodyTypeCar.SEDAN);
        Car bmw = new Car("BMW", "5s", 3.0, BodyTypeCar.CROSSOVER);
        Car kia = new Car("Kia", "S4", 1.8, BodyTypeCar.SUV);
        Car lada = new Car("Lada", "Granta", 1.6, null);
        kia.determineTypeOfCar();
        lada.determineTypeOfCar();
        audi.determineTypeOfCar();
        bmw.determineTypeOfCar();
        System.out.println();

        Bus schoolBus = new Bus("Школьный", "Ш-1", 2.0, CapacityTypeBus.SMALL);
        Bus workBus = new Bus("Рабочий", "В-2", 1.2, null);
        Bus cityBus = new Bus("Городской", "Г-14", 3.0, CapacityTypeBus.LARGE);
        Bus touristBus = new Bus("Туристический", "Т-11", 3.5, CapacityTypeBus.ESPECIALLY_LARGE);
        schoolBus.determineTypeOfBus();
        touristBus.determineTypeOfBus();
        workBus.determineTypeOfBus();
        cityBus.determineTypeOfBus();
        System.out.println();

        Truck kamaz = new Truck("KamAZ", "K-10", 2.6, LoadTypeTruck.N1);
        Truck zil = new Truck("ZIL", "M-2", 2.0, LoadTypeTruck.N2);
        Truck ural = new Truck("URAL", "Y-4", 3.0, LoadTypeTruck.N3);
        Truck gaz = new Truck("GAZ", "G-6", 3.0, null);
        zil.determineTypeOfTtuck();
        gaz.determineTypeOfTtuck();
        kamaz.determineTypeOfTtuck();
        ural.determineTypeOfTtuck();


    }
}