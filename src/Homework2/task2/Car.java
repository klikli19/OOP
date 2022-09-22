package Homework2.task2;

public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int productionYear;
    private final String productionCountry;

    public Car (String brand, String model, double engineVolume, String color, int productionYear,
                String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public void infoOfCar () {
        System.out.println(brand + " " + model + ". Год выпуска: " + productionYear + ". Сборвка в " + productionCountry
                + ". Цвет кузова: " + color + ". Объем двигателя: " + engineVolume + " литра.");
    }
}
