package HW3.Homework1.task1;

import java.time.LocalDate;
import java.util.Objects;

public class Human {
    private final String name;
    private String town;
    private final String job;
    private int yearOfBirth;

    public Human(String name, int age, String town, String job) {
        this.name = Objects.requireNonNullElse(name, "(Информация не указана)");
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "(Информация не указана)";
        } else {
            this.town = town;
        }
        this.job = Objects.requireNonNullElse(job, "(Информация не указана)");
        this.yearOfBirth = age < 0 ? 0 : LocalDate.now().getYear() - age;

    }

    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "(Информация не указана)";
        } else {
            this.town = town;
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public  void setYearOfBirth (int age) {
        yearOfBirth = age < 0 ? 0 : LocalDate.now().getYear() - age;
    }

    public void greetings () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
