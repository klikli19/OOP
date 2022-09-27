package HW2.Homework1.task1;

import java.time.LocalDate;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;

    public void setYearOfBirth(int age) {
        yearOfBirth = LocalDate.now().getYear() - age;
    }

    public String getTown() {
        return town;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void greetings () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Будем знакомы!");
    }
}
