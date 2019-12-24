
package com.dileep;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        TaskManager c = new TaskManager();


        int idCount=1;
        while(true){
            System.out.print("------------\nMenu\n1.Add\n2.Display\n3.Delete\n4.Search\n" +
                                           "5.ListByStatus\n6:updateStatus\n7:totalTasks\n" +
                                            "8:Exit\n");
            System.out.println("Enter choice:");
            int menuId=Integer.parseInt(br.readLine());

            if(menuId == 1){
                System.out.println("Enter Task name");
                String name=br.readLine();
                System.out.println("Enter task descripton");
                String description=br.readLine();
                System.out.println("Enter the status of task : \n 1:Created \n 2:InProgress \n 3:Done");
                String status=br.readLine();
                Task task= new Task(idCount, name, description, Status.valueOf(status));
                c.add(task);
                idCount+=1;
            }


            else if(menuId == 2){
                c.display();
            }

            else if(menuId == 3){
                System.out.println("Enter taskId to Delete :");
                int taskId=Integer.parseInt(br.readLine());
                c.delete(taskId);
            }

            else if(menuId == 4){
                System.out.println("Enter TaskId name to search:");
                if(c.search(Integer.parseInt(br.readLine()))) {
                    System.out.println("Data Found");
                }
                    else{
                     System.out.println("No data found");
                    }
                }

            else if(menuId == 5){
                System.out.println("Enter the status:");
                String status=br.readLine();
                c.listByStatus(Status.valueOf(status));
            }

            else if(menuId == 6){
                System.out.println("Enter taskId to update:");
                int getTaskID=Integer.parseInt(br.readLine());
                System.out.println("Enter status to Update");
                String status=br.readLine();
                c.updateStatus(Status.valueOf(status), getTaskID);

            }

            else if(menuId == 7){
                System.out.println("Total number of Tasks:"+c.getTotalCount());
            }

            else if(menuId == 8) System.exit(0);
            }

        }

    }
