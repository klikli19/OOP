package HW3.Transport;

public class Main {
    public static void main(String[] args) {
        Car ladaGrande = new Car("Lada", "Grande", null, "желтый", 2015,
                "Россия", "механика", "седан", "A456NM657",
                5, "летняя");
        Car audiA8 = new Car(null, "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия", "автомат", "седан", "K454OH2441",
                5, "зимняя");
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, null, 2021,"Германия",
                "механика", "кабриолет", " ", 2, "летняя");
        Car kiaSportage4 = new Car("Kia", "Sportage 4 поколение", 2.4, "красный",
                null,"Южная Корея", "автомат", "внедорожник",
                null, 5, "зимняя");
        Car hyundayAvante = new Car("Hyundai", "Avante 4", 1.6, "оранжевый", 2016,
                null, "автомат", "седан", "T876LKKJ11", 5, "летняя");

        bmwZ8.setTires("зимняя");
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(ladaGrande);
        System.out.println(hyundayAvante);
        System.out.println();
        Car.Key keyAudiA8 = new Car.Key("брелок", "мобильное приложение");
        audiA8.setKey(keyAudiA8);
        System.out.println(audiA8);
        System.out.println(keyAudiA8);
        System.out.println();
        Car.Insurance insuranceBmwZ8 = new Car.Insurance(0.0, 5000, "AAA7854521");
        bmwZ8.setInsurance(insuranceBmwZ8);
        System.out.println(insuranceBmwZ8);
        insuranceBmwZ8.checkDuration();
        System.out.println();
        Car.Insurance insuranceKia = new Car.Insurance(1.3, 0, "EEE124787");
        kiaSportage4.setInsurance(insuranceKia);
        insuranceKia.checkDuration();
        System.out.println(kiaSportage4);
        System.out.println(insuranceKia);

    }
}
