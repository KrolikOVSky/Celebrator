package ru.solarlab.celebrator.entity.model.out;

import ru.solarlab.celebrator.entity.Celebrate;

public class CelebrateModel {
    private int age;
    private String snm;

    public CelebrateModel(Celebrate celebrate) {
        this.age = celebrate.getAge();
        this.snm = celebrate.getSnm();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSnm() {
        return snm;
    }

    public void setSnm(String snm) {
        this.snm = snm;
    }
}
