package HW3.Homework1.task2;

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
        for (Flower element : flowers) {
            if (element != null) {
                sum += element.getCost();
                costBouquet = (sum * percent) + sum;
            }
        }
        System.out.println("Стоимость букета: " + String.format("%.2f", costBouquet) + " рублей.");
    }

    public void searchMinLifeSpan() {
        int minLifeSpan = flowers[0].getLifeSpan();
        for (Flower employee : flowers) {
            if (employee != null && minLifeSpan > employee.getLifeSpan()) {
                minLifeSpan = employee.getLifeSpan();
            }
        }
            System.out.println("Продолжительность жизни букета: " + minLifeSpan + " дней.");
    }


}
