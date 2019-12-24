package com.dileep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskManager {
    BufferedReader br;
    TaskManager(){
        this.br=new BufferedReader(new InputStreamReader(System.in));
    }
    public task input()throws IOException {
        System.out.println("Enter Task name");
        String name=this.br.readLine();
        System.out.println("Enter task descripton");
        String description=this.br.readLine();
        System.out.println("Enter the status of task : \n 1:Created \n 2:InProgress \n 3:Done");
        String str=br.readLine();
        task n= new task(name, description, status.valueOf(str));
        return n;
    }
    public void add(task n, ArrayList<task> li){
        li.add(n);
    }
    public void display(ArrayList<task>li){
        for(task i:li) System.out.println(i);
    }
    public void delete(String name,ArrayList<task>li){
        for(task i:li){
            if(i.getName().matches(name)){
                li.remove(i);
            }
        }
    }
    public boolean search(String name,ArrayList<task>li){
        int c=0;
        for(task i:li){
            if(i.getName().matches(name)) c = 1;
        }
        if(c==1) return true;
        else return false;
    }

    public void LIstByStatus(status s, ArrayList<task> li) {
        for(task i:li){
            if(i.getSt().equals(s))
                System.out.println(i);
        }
    }
}
