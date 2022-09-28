package HW3.Homework1.task2;

public class Flower {

    private final String name;
    private String flowerColor;
    private String country;
    private double cost;
    private final Integer lifeSpan;

    public Flower(String name, String flowerColor, String country, double cost, Integer lifeSpan) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Имя не указано";
        } else {
            this.name = name;
        }
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        this.cost = cost <= 0 ? 1 : cost;
        if (lifeSpan == null || lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost <= 0 ? 1 : cost;
    }

    public Integer getLifeSpan() {
        return lifeSpan;
    }

    @Override
    public String toString() {
        return name + ", цвет - " + flowerColor + ", страна - " + country + ", срок жизни - " + lifeSpan + " дней, " +
                "стоимость за штуку -  " + cost + " рублей.";
    }
}
