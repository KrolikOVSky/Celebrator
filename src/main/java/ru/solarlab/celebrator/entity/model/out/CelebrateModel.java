package ru.solarlab.celebrator.entity.model.out;

import ru.solarlab.celebrator.entity.Celebrate;

public class CelebrateModel {
    private int age;
    private String name;
    private String lastName;
    private String midName;
    private String image;
    private String date;
    private int mark;

    public CelebrateModel(Celebrate celebrate) {
        this.age = celebrate.getAge();
        this.date = String.format("%d-%d-%d", celebrate.getYear(), celebrate.getMonth(), celebrate.getDay());
        this.mark = celebrate.getMark();
        this.name = celebrate.getName();
        this.lastName = celebrate.getLastName();
        this.midName = celebrate.getMidName();
        this.image = celebrate.getImage();
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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


}
