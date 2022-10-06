package HW3.Homework1.task2;

import java.util.Arrays;

public class Bouquet {
    private  Flower [] flowers;

    public Bouquet(Flower[] flowers) {
        if (flowers != null) {
            this.flowers = flowers;
        }
    }

    public void calcBouquet (double percent) {
        double sum = 0;
        double costBouquet = 0;
        System.out.println("Состав букета:");
        for (Flower element : flowers) {
            if (element != null) {
                sum += element.getCost();
                costBouquet = (sum * percent) + sum;

                System.out.println(element.getName());
            }
        }

        System.out.println("Стоимость букета: " + String.format("%.2f", costBouquet) + " рублей.");
    }

    public void searchMinLifeSpan() {
        int minLifeSpan = flowers[0].getLifeSpan();
        for (Flower flower : flowers) {
            if (flower != null && minLifeSpan > flower.getLifeSpan()) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
            System.out.println("Продолжительность жизни букета: " + minLifeSpan + " дней.");
    }


}
