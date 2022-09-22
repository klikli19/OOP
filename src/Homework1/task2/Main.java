package Homework1.task2;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.age = 35;
        maksim.town = "Минск";
        maksim.job = "бренд-менеджер";
        Human anya = new Human();
        anya.name = "Аня";
        anya.age = 29;
        anya.town = "Москва";
        anya.job = "методист образовательных программ";
        Human katya = new Human();
        katya.name = "Катя";
        katya.age = 28;
        katya.town = "Калининград";
        katya.job = "продакт-менеджер";
        Human artem = new Human();
        artem.name = "Артем";
        artem.age = 27;
        artem.town = "Москва";
        artem.job = "директор по развитию бизнеса";
        maksim.greetings();
        anya.greetings();
        katya.greetings();
        artem.greetings();
    }
}
