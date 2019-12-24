package com.dileep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.IdentityScope;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    int idCounter=1;

   InMemoryTaskRepository repository = new InMemoryTaskRepository();

    public void addTask(String name, String description, Status status){
        repository.addTask( new Task(idCounter,name,description,status));
        idCounter+=1;
    }

    public List<Task> display(){
        List<Task> taskList=repository.display();
       return taskList;
    }

    public void delete(int taskId) {
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
}
