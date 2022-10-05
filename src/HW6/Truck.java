package HW6;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение с грузом");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик привез груз в пункт назначения");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " остановился поменять колесо");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + getBrand() + " показал лучшую скорость");
    }

    @Override
    public void bestTime() {
        System.out.println("Грузовик " + getBrand() + " приехал первым");
    }
}
