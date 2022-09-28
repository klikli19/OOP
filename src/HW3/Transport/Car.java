package HW3.Transport;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private Double engineVolume;
    private String color;
    private final Integer productionYear;
    private final String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tires;


    public Car(String brand, String model, Double engineVolume, String color, Integer productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberOfSeats, String tires) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 1.5);
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        this.productionYear = Objects.requireNonNullElse(productionYear, 2000);
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "Нет информации";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Нет информации";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()){
            registrationNumber = "Нет информации";
        }
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "Неверный формат номера";
        }
        this.numberOfSeats =  numberOfSeats <= 0 ? 5 : numberOfSeats;
        if (tires == null || tires.isEmpty() || tires.isBlank()) {
            this.tires = "Нет информации";
        } else {
            this.tires = tires;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = Objects.requireNonNullElse(engineVolume, 1.5);
    }

    public String getTransmission() {
        return transmission;
    }


    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "Нет информации";
        } else {
            this.transmission = transmission;
        }
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Нет информации";
        } else {
            this.bodyType = bodyType;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "Нет информации";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats =  numberOfSeats <= 0 ? 5 : numberOfSeats;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        if (tires == null || tires.isEmpty() || tires.isBlank()) {
            this.tires = "Нет информации";
        } else {
            this.tires = tires;
        }
    }

    public boolean validRegNum() {
        return this.registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}");

    }



    @Override
    public String toString() {
        return brand + " " + model + ". Год выпуска: " + productionYear + ". Сборвка в " + productionCountry
                + ". Цвет кузова: " + color + ". Объем двигателя: " + engineVolume + " литра. Коробка передач: " +
                transmission + ". Тип кузова: " + bodyType + ". Регистрационный номер: " + registrationNumber +
                ". Количество мест: " + numberOfSeats + ". Тип резины: " + tires;
    }


}
