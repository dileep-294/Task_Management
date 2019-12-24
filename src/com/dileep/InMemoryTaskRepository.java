package com.dileep;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository{
    ArrayList<Task> taskList=new ArrayList<Task>();


    public void addTask(Task task){
        taskList.add(task);
    }

    public List<Task> display(){
        return taskList;
    }

    public void delete(int taskId){
        for(Task task:taskList){
            if(task.getTaskId()==taskId){
                taskList.remove(task);
            }
        }
    }

    public Task searchByTaskId(int taskId){
        for(Task task:taskList) if (task.getTaskId() == taskId) return task;
        return null;
    }

    public List<Task>  listByStatus(Status status){
        ArrayList<Task>tempTaskList = new ArrayList<>();
        for(Task task:taskList){
            if(task.getStatus().equals(status))
                tempTaskList.add(task);
        }
        return tempTaskList;
    }

    public void updateStatus(Status status, int taskId){
        for(Task task:taskList){
            if(task.getTaskId()==taskId){
                task.setStatus(status);
            }
        }
    }
    public int getTotalCount(){
        return taskList.size();
    }
}
