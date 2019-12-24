package com.dileep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        TaskManager c = new TaskManager();
        ArrayList<task>li=new ArrayList<task>();
        while(true){
            System.out.print("------------\nMenu\n1.Add\n2.Display\n3.Delete\n4.Search\n5.ListByStatus\n6:Exit\n");
            System.out.println("Enter choice:");
            int task_id=Integer.parseInt(br.readLine());
            if(task_id==1){
                task n=c.input();
                c.add(n,li);
            }
            else if(task_id==2){
                c.display(li);
            }
            else if(task_id==3){
                System.out.println("Enter task name to delete:");
                String name=br.readLine();
                c.delete(name,li);
            }
            else if(task_id==4){
                System.out.println("Enter Task name to search:");
                if(c.search(br.readLine(),li)) {
                    System.out.println("Data Found");
                }
                    else{
                     System.out.println("No data found");
                    }
                }
            else if(task_id==5){
                System.out.println("Enter the status:");
                String s=br.readLine();
                c.LIstByStatus(status.valueOf(s),li);
            }
            else if(task_id==6) System.exit(0);
            }
        }

    }
