package Homework1.task1;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human();
        maksim.setName("Максим");
        maksim.setYearOfBirth(35);
        maksim.setTown("Минск");
        Human anya = new Human();
        anya.setName("Аня");
        anya.setYearOfBirth(29);
        anya.setTown("Москва");
        Human katya = new Human();
        katya.setName("Катя");
        katya.setYearOfBirth(28);
        katya.setTown("Калининград");
        Human artem = new Human();
        artem.setName("Артем");
        artem.setYearOfBirth(27);
        artem.setTown("Москва");
        maksim.greetings();
        anya.greetings();
        katya.greetings();
        artem.greetings();
    }
}
