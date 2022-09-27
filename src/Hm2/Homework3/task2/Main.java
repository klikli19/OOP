package Hm2.Homework3.task2;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada", "Grande", null, "желтый", 2015,"Россия");
        Car audiA8 = new Car(null, "A8 50 L TDI quattro", 3.0, "черный", 2020,"Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021,"Германия");
        Car kiaSportage4 = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", null,"Южная Корея");
        Car hyundayAvante = new Car("Hyundai", "Avante 4", 1.6, "оранжевый", 2016,null);
        ladaGrande.infoOfCar();
        bmwZ8.infoOfCar();
        audiA8.infoOfCar();
        kiaSportage4.infoOfCar();
        hyundayAvante.infoOfCar();
    }
}
