package HW4.transport;

import java.util.Objects;

public class Transport {
    private String brand;
    private String model;
    private Integer productionYear;
    private String productionCountry;
    private String bodyColor;
    private Integer maxSpeed;

    public Transport(String brand, String model, Integer productionYear, String productionCountry, String bodyColor, Integer maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setBodyColor(bodyColor);
        setMaxSpeed(maxSpeed);
    }
    public Transport(String brand, String model, Integer productionYear, String productionCountry, Integer maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        setMaxSpeed(maxSpeed);
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


    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null ||bodyColor.isBlank()) {
            this.bodyColor = "синий";
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (maxSpeed == null || maxSpeed <= 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public void infoOfVehicle() {
        System.out.println("Информация о транспортном средстве:");
    }
}
