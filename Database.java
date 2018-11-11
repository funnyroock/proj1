/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_proj1;

/**
 *
 * @author yilei
 */
public class Database {
    //field
    Employee DB[] = new Employee[10];
    int db = 0;
    Employee message;
    
    //method
    public Employee register(Employee emp){
        
        DB[db] = emp;
        //System.out.println(DB[db].getName());//getId, getDob
        message = DB[db];
        db++;
        return message;
        
    }
    
    public int getEmployeesNum(){
        return db;
    }//gEN
    
    public Employee[] getEmployee(){
        return DB;
    }//gE
    
    //constr
    
    
}
