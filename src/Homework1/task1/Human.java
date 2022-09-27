package Homework1.task1;

import java.time.LocalDate;

public class Human {
    String name;
    int yearOfBirth;
    String town;

    public void setYearOfBirth(int age) {
        yearOfBirth = LocalDate.now().getYear() - age;
    }


    public void greetings () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Будем знакомы!");
    }
}
