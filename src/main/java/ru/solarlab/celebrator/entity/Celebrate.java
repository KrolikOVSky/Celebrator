package ru.solarlab.celebrator.entity;

import java.time.LocalDate;
import java.time.Period;

public class Celebrate {
    private int age;
    private int year;
    private int month;
    private int day;
    private int mark;
    private String name;
    private String lastName;
    private String midName;
    private String image;

    public Celebrate(Birthday birthday) {
        this.name = birthday.getName();
        this.lastName = birthday.getLastName();
        this.midName = birthday.getMidName();
        this.image = birthday.getImage();
        this.day = birthday.getDate().getDayOfMonth();
        this.month = birthday.getDate().getMonthValue();
        this.year = birthday.getDate().getYear();
        this.age = Period.between(birthday.getDate(), LocalDate.now()).getYears();
        this.mark = 0;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
