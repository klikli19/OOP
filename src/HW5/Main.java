package HW5;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8", 2.5);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("Kia", "S4", 1.8);
        Car lada = new Car("Lada", "Granta", 1.6);

        Bus schoolBus = new Bus("Школьный", "Ш-1", 2.0);
        Bus workBus = new Bus("Рабочий", "В-2", 1.2);
        Bus cityBus = new Bus("Городской", "Г-14", 3.0);
        Bus touristBus = new Bus("Туристический", "Т-11", 3.5);

        Truck kamaz = new Truck("KamAZ", "K-10", 2.6);
        Truck zil = new Truck("ZIL", "M-2", 2.0);
        Truck ural = new Truck("URAL", "Y-4", 3.0);
        Truck gaz = new Truck("GAZ", "G-6", 3.0);

        System.out.println(audi);
        audi.bestTime();
        System.out.println(bmw);
        bmw.startMoving();
        System.out.println(lada);
        lada.finishMoving();
        System.out.println(kia);
        kia.pitStop();
        System.out.println();

        System.out.println(workBus);
        workBus.maxSpeed();
        System.out.println(schoolBus);
        schoolBus.startMoving();
        System.out.println(cityBus);
        cityBus.finishMoving();
        System.out.println(touristBus);
        touristBus.pitStop();
        touristBus.bestTime();
        System.out.println();

        System.out.println(kamaz);
        kamaz.pitStop();
        System.out.println(ural);
        ural.bestTime();
        System.out.println(gaz);
        gaz.maxSpeed();
        System.out.println(zil);
        zil.startMoving();
    }
}
