package Homework2.task1;

import java.time.LocalDate;

public class Human {
    private final String name;
    private int age;
    private String town;
    private  String job;
    private  int yearOfBirth;

    public  Human (String name, int age, String town, String job) {
        this.name = name;
        this.age = age;
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

    public void setAge (int age) {
        if (age !=0) {
            this.age = age;
        }
    }


    public void greetings () {
        int yearOfBirth = LocalDate.now().getYear() - age;
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
