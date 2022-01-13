package ru.solarlab.celebrator.entity.model.in;

public class UpdateBirthdayModel {

    private String id;
    private String name;
    private String lastName;
    private String midName;
    private String sex;
    private String role;
    private String date;
    private String image;

    public UpdateBirthdayModel(String id, String name, String lastName, String midName, String sex, String role, String date, String image) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.midName = midName;
        this.sex = sex;
        this.role = role;
        this.date = date;
        this.image = image;
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
