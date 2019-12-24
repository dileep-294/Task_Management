package com.dileep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task>list=new ArrayList<Task>();
    public void add(Task task){
        list.add(task);
    }

    public void display(){
        for(Task task:list) System.out.println(task);
    }


    public void delete(int taskId) {
        for(Task task:list){
            if(task.getTaskId()==taskId){
                list.remove(task);
            }
        }
    }

    public boolean search(int taskId){
        int flag = 0;
        for(Task task:list) {
            if (task.getTaskId()==taskId) flag = 1;
        }
        if(flag==1) return true;
        else return false;
    }

    public void  listByStatus(Status status) {
        for(Task task:list){
            if(task.getStatus().equals(status))
                System.out.println(task);
        }
    }

    public void updateStatus(Status status, int getTaskID){
                for(Task task:list){
                    if(task.getTaskId()==getTaskID){
                        task.setStatus(status);
                    }
                }
    }
    public int getTotalCount(){
        return list.size();
    }
}
