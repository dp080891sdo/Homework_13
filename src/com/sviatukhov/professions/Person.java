package com.sviatukhov.professions;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    public String fullName;
    public static String birthDay;
    static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public int ageDriver() {
        LocalDate date = LocalDate.parse(birthDay, dateFormatter);
        return Period.between(date, LocalDate.now()).getYears();
    }

    public Person(String fullName, String birthDay) {
        this.fullName = fullName;
        this.birthDay = birthDay;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public static String getBirthDay() {
        return birthDay;
    }

    public static void setBirthDay(String birthDay) {
        Person.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
