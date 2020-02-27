package com.example.myapplication.entiy;

import java.io.Serializable;

public class EmpBean implements Serializable {
    private int sabun;
    private String name;

    public EmpBean() {
    }

    public EmpBean(int sabun, String name) {
        this.sabun = sabun;
        this.name = name;
    }

    public int getSabun() {
        return sabun;
    }

    public void setSabun(int sabun) {
        this.sabun = sabun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmpBean{" +
                "sabun=" + sabun +
                ", name='" + name + '\'' +
                '}';
    }
}
