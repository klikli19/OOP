package Homework3.task1;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(null, 35, "Минск","бренд-менеджер");
        Human anya = new Human("Аня", 29, null, "методист образовательных программ");
        Human katya = new Human("Катя", -28, "Калининград",null);
        Human artem = new Human("Артем", -27, "Москва", "директор по развитию бизнеса");
        Human alesha = new Human(null, -10, null, null);
        maksim.greetings();
        anya.greetings();
        anya.setYearOfBirth(-7);
        anya.setTown(null);
        anya.greetings();
        katya.greetings();
        artem.greetings();
        alesha.greetings();

    }
}
