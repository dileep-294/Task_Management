package com.dileep;

import java.time.LocalDate;

class Task {
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    private int taskId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private LocalDate date = LocalDate.now();

    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status st) {
        this.status = st;
    }

    public Task(int taskId, String name, String description, Status status) {
        this.taskId = taskId;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", status=" + status +
                '}';
    }
}
