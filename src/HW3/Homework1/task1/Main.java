package HW3.Homework1.task1;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human( "Максим", 35, " ","бренд-менеджер");
        Human anya = new Human("Аня", 29, null, "методист образовательных программ");
        Human katya = new Human("Катя", -28, "Калининград","продакт-менеджером");
        Human artem = new Human("Артем", -27, "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", 21, "Казань", null);
        maksim.greetings();
        anya.greetings();
        katya.greetings();
        artem.greetings();
        vladimir.greetings();

    }
}
