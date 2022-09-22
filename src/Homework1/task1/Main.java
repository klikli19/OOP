package Homework1.task1;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.age = 35;
        maksim.town = "Минск";
        Human anya = new Human();
        anya.name = "Аня";
        anya.age = 29;
        anya.town = "Москва";
        Human katya = new Human();
        katya.name = "Катя";
        katya.age = 28;
        katya.town = "Калининград";
        Human artem = new Human();
        artem.name = "Артем";
        artem.age = 27;
        artem.town = "Москва";
        maksim.greetings();
        anya.greetings();
        katya.greetings();
        artem.greetings();
    }
}
