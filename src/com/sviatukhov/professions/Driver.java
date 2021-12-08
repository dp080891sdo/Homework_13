package com.sviatukhov.professions;

public class Driver extends Person {
    private final int experience;

    public Driver(String fullName, String birthDay, int experience) {
        super(fullName, birthDay);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}