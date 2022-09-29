package HW4.transport;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada", "Grande", null, "желтый",
                2015,"Россия", "механика", "седан", "A456NM657",
                5, "летняя", 130);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный",
                2020, "Германия", "автомат", "седан", "K454OH2441",
                5, "зимняя", null);
        ladaGrande.infoOfVehicle();

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия",301,
                "Белорусский вокзал", "Минск-Пассажирский", 3500.0, 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270,
                "Ленинградский вокзал", "Ленинградский-Пассажирский", 1700.0,8);
        lastochka.infoOfVehicle();
        leningrad.infoOfVehicle();
    }
}
