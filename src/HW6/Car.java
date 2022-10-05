package HW6;

public class Car extends Transport implements Competing {
public

    public Car(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль приехал");
    }


    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " остановился поменять водителя, заправиться");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автомобиль " + getBrand() + " имеет лучшую скорость в гонке");
    }

    @Override
    public void bestTime() {
        System.out.println("Автомобиль " + getBrand() + " продемонстрировал лучшее время");
    }
}
