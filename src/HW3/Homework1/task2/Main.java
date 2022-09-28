package HW3.Homework1.task2;


public class Main {
    public static void main(String[] args) {

        Flower rose = new Flower("Роза обыкновенная", " ", "Голландия", 35.59, null);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5);
        Flower peony = new Flower("Пион", " ", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        Flower[] flowers = new Flower[9];
        flowers[0] = rose;
        flowers[1] = rose;
        flowers[2] = rose;
        flowers[3] = chrysanthemum;
        flowers[4] = chrysanthemum;
        flowers[5] = chrysanthemum;
        flowers[6] = chrysanthemum;
        flowers[7] = chrysanthemum;
        flowers[8] = gypsophila;

        Bouquet bouquet1 = new Bouquet(flowers);
        bouquet1.calcBouquet(0.1);
        bouquet1.searchMinLifeSpan();

        Flower [] flowers1 = new Flower[] {peony, peony, peony, chrysanthemum, chrysanthemum};
        Bouquet bouquet2 = new Bouquet(flowers1);
        bouquet2.calcBouquet(0.1);
        bouquet2.searchMinLifeSpan();
    }
}
