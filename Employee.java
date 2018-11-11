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
public class Employee {
    //field
    private String id;
    private String name;
    private String dob;
    
    //method
    public String getId(){
        return id;
    }//gI
    
    public String getName(){
        return name;
    }//gN
    
    public String getDob(){
        return dob;
    }//gD
    
    //constr
    protected Employee(String id,String name, String dob){        //super and sub class, use protected
        
        this.id = id;
        this.name = name;
        this.dob = dob;
                
    }//constr
    
}//class
