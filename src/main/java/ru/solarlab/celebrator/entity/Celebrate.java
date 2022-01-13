package ru.solarlab.celebrator.entity;

import java.time.LocalDate;
import java.time.Period;

public class Celebrate {

    private int age;
    private int year;
    private int month;
    private int day;
    private int mark;
    private String snm;

    public Celebrate(Birthday birthday) {
        this.snm = String.format("%s %s %s ( %s )", birthday.getName(), birthday.getLastName(), birthday.getMidName(), birthday.getDate().toString());
        this.day = birthday.getDate().getDayOfMonth();
        this.month = birthday.getDate().getMonthValue();
        this.year = birthday.getDate().getYear();
        this.age = Period.between(birthday.getDate(), LocalDate.now()).getYears();
        this.mark = 0;
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

    public String getSnm() {
        return snm;
    }

    public void setSnm(String snm) {
        this.snm = snm;
    }
}
