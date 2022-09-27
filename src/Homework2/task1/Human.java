package Homework2.task1;

import java.time.LocalDate;

public class Human {
    private final String name;
    private String town;
    private final String job;
    private int yearOfBirth;

    public  Human (String name, int age, String town, String job) {
        this.name = name;
        this.town = town;
        this.job = job;
        this.yearOfBirth = LocalDate.now().getYear() - age;
    }

    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public  void setYearOfBirth (int age) {
        yearOfBirth = LocalDate.now().getYear() - age;
    }




    public void greetings () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
