package com.dileep;

import java.time.LocalDate;

public class task {
    private String name;
    private String description;
    private LocalDate date = LocalDate.now();

    public task(String name, String description, status st) {
        this.name = name;
        this.description = description;
        this.st = st;
    }

    private status st;
    public status getSt() {
        return st;
    }

    public void setSt(status st) {
        this.st = st;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", st=" + st +
                '}';
    }
}
