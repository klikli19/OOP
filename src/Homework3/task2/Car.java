package Homework3.task2;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final Double engineVolume;
    private final String color;
    private final Integer productionYear;
    private final String productionCountry;

    public Car(String brand, String model, Double engineVolume, String color, Integer productionYear,
                String productionCountry) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 1.5);
        this.color = Objects.requireNonNullElse(color, "белый");
        this.productionYear = Objects.requireNonNullElse(productionYear, 2000);
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
    }

    public void infoOfCar() {
        System.out.println(brand + " " + model + ". Год выпуска: " + productionYear + ". Сборвка в " + productionCountry
                + ". Цвет кузова: " + color + ". Объем двигателя: " + engineVolume + " литра.");
    }
}
