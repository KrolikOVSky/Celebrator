package ru.solarlab.celebrator.entity.model.out;

import ru.solarlab.celebrator.entity.Birthday;

public class BirthdayModel {

    private String id;
    private String name;
    private String lastName;
    private String midName;
    private String sex;
    private String role;
    private String date;
    private String image;

    public BirthdayModel(Birthday birthday) {
        this.id = birthday.getId().toString();
        this.name = birthday.getName();
        this.lastName = birthday.getLastName();
        this.midName = birthday.getMidName();
        this.sex = birthday.getSex();
        this.role = birthday.getRole();
        this.date = birthday.getDate().toString();
        this.image = birthday.getImage();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
