package ru.solarlab.celebrator.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Birthday {
    @Id
    @Type(type = "pg-uuid")
    private final UUID id = UUID.randomUUID();

    private String name;
    private String lastName;
    private String midName;
    private String sex;
    private String role;
    private LocalDate date;
    @Type(type = "text")
    private String image;

    protected Birthday() {
    }

    public Birthday(String name, String lastName, String midName, String sex, String role, LocalDate date, String image) {
        this.name = name;
        this.lastName = lastName;
        this.midName = midName;
        this.sex = sex;
        this.role = role;
        this.date = date;
        this.image = image;
    }

    public UUID getId() {
        return id;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
