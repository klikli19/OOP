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
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(ladaGrande);

        System.out.println(hyundayAvante);
        hyundayAvante.validRegNum();
    }
}
