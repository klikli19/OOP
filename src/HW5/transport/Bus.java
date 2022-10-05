package HW5.transport;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус отправился от остановки");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус прибыл на конечную остановку");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " остановился на дозаправку");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + getBrand() + " ехал быстрее всех");
    }

    @Override
    public void bestTime() {
        System.out.println("Автобус " + getBrand() + " проказал лучшее время в заезде");
    }
}