package HW2.Homework2.task2;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada", "Grande", 1.7, "желтый", 2015,"Россия");
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3, "черный", 2020,"Германия");
        Car bmwZ8 = new Car("BMW", "Z8", 3, "черный", 2021,"Германия");
        Car kiaSportage4 = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018,"Южная Корея");
        Car hyundayAvante = new Car("Hyundai", "Avante 4", 1.6, "оранжевый", 2016,"Южная Корея");
        ladaGrande.infoOfCar();
        bmwZ8.infoOfCar();
        audiA8.infoOfCar();
        kiaSportage4.infoOfCar();
        hyundayAvante.infoOfCar();
    }
}
