package com.dileep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.IdentityScope;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Random;

public class TaskManager {
    //int idCounter=1;

   TaskRepository repository = new TaskFileRepository();

    public void addTask(String name, String description, Status status,Date date)
   {
       Random random = new Random();

        repository.addTask( new Task(random.nextInt(1000),name,description, date, status));
       //idCounter+=1;
    }

    public List<Task> display(){
        List<Task> taskList=repository.display();
       return taskList;
    }

    public void delete(int taskId) {
        System.out.println("Enter to taskmanager");
        repository.delete(taskId);

    }

    public Task searchByTaskId(int taskId){
        Task task=repository.searchByTaskId(taskId);
        return task;
    }

    public List<Task>  listByStatus(Status status) {
        List<Task> taskList=repository.listByStatus(status);
        return taskList;
    }

    public void updateStatus(Status status, int taskId){
        repository.updateStatus(status,taskId);

    }

    public int getTotalCount(){
        int taskCount=repository.getTotalCount();
        return taskCount;
    }

    public List<Task> getPendingTasks() {
        return repository.getPendingTasks();
    }

    public List<Task> getTodaysTasks() {
        return repository.getTodaysTasks();
    }
}
