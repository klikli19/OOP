package HW2.Homework1.task3;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;


    public void infoOfCar () {
        System.out.println(brand + " " + model + ". Год выпуска: " + productionYear + ". Сборвка в " + productionCountry
                + ". Цвет кузова: " + color + ". Объем двигателя: " + engineVolume + " литра.");
    }
}
