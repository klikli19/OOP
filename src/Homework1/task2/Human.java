package Homework1.task2;

import java.time.LocalDate;

public class Human {
    String name;
    int yearOfBirth;
    String town;
    String job;

    public void setYearOfBirth(int age) {
        this.yearOfBirth = LocalDate.now().getYear() - age;
    }
    public void greetings () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
