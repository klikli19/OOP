package Homework2.task1;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", 35, "Минск","бренд-менеджер");
        maksim.setYearOfBirth(16);
        Human anya = new Human("Аня", 29, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 28, "Калининград","продакт-менеджер");
        Human artem = new Human("Артем", 27, "Москва", "директор по развитию бизнеса");
        maksim.greetings();
        anya.greetings();
        katya.greetings();
        artem.greetings();
    }
}
