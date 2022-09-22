package Homework1.task1;

import java.time.LocalDate;

public class Human {
    String name;
    int age;
    String town;


    public void greetings () {
        int yearOfBirth = LocalDate.now().getYear()- age;
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Будем знакомы!");
    }
}
