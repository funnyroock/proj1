/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_proj1;

import java.util.*;

/**
 *
 * @author yilei
 */
public class UI {
    //field
    String input;
    String inputId;
    
    String id;
    String name;
    String dob;
    
    Scanner sc_id = new Scanner(System.in);
    Scanner sc_name = new Scanner(System.in);
    Scanner sc_dob = new Scanner(System.in);
    private Employer cr = new Employer();
    
    //method
    public void showMenu(){
        
        do{
            
            basicMenu();
        
            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();
            
            while(input.compareTo("1") != 0 && input.compareTo("2") != 0 &&
                  input.compareTo("3") != 0 && input.compareTo("4") != 0 &&
                  input.compareTo("5") != 0){
                
                System.out.println("Sorry, you entered a wrong number.");
                System.out.println("Please enter again.");
                System.out.println("---------------------------------");
                System.out.print("SELECT MENU 1 - 5: ");
                
                input = sc.nextLine();
            
            }//Exception
            
            if(input.compareTo("1") == 0){
                
                System.out.println();
                System.out.print("Insert ID (2 digits): ");
                id = sc_id.nextLine();   //how to void exception? && why cannot just use sc
                System.out.print("Insert name: ");
                name = sc_name.nextLine();
                System.out.print("Insert DOB (mm/dd/yy): ");
                dob = sc_dob.nextLine();
                
                Employee emp = new Employee(id, name, dob);
                Employee result = cr.register(emp);
                
                System.out.println(id + " " + name + " " + dob + 
                        "................................ registered successfully!");
                System.out.println();
                
            }//1.registration
            else if(input.compareTo("2") == 0){ 
                
                System.out.println();
                System.out.println("SEARCH BY ID: ");
                System.out.print("Insert id (2 digits): ");
                inputId = sc_id.nextLine();
                System.out.println();
                System.out.println("Search by id: " + inputId);
                cr.search(inputId);
                System.out.println();
                
            }//2.searchById
            else if(input.compareTo("3") == 0){
                
                System.out.println();
                System.out.println("TOTAL NUMBER OF EMPLOYEE: " + cr.count());
                System.out.println();
                
            }//3.totalNumberOfEmployee
            else if(input.compareTo("4") == 0){
                
                System.out.println();
                System.out.println("EMPLOYEE LIST: ");
                cr.list();
                System.out.println();
                
            }//4.enployeeList
            
        }while(input.compareTo("5") != 0);//5.quit
        
        System.out.println();
        System.out.println("Terminate the system!");
        
    }//sM
    
    public void basicMenu(){
        
        System.out.println("MENU ----------------------------");
        System.out.println("1.Registration");
        System.out.println("2.Search by id");
        System.out.println("3.Total number of employee");
        System.out.println("4.Employee list");
        System.out.println("5.Quit");
        System.out.println("---------------------------------");
        System.out.print("SELECT MENU 1 - 5: ");
        
    }//bM
    
    //constr
    
    
}//class
