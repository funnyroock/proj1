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
public class Employer {
    //field
    Database db = new Database();
    
    //method
    public Employee register(Employee emp){
        //System.out.println(emp.getName()); //getId, getDob
        Employee result = db.register(emp);
        return result;
        
    }//reg
    
    public Employee search(String id){
        for(int i = 0; i < db.getEmployeesNum(); i++){
            if(db.DB[i].getId().equals(id)){
                System.out.println(db.DB[i].getId() + " " + db.DB[i].getName()
                    + " " + db.DB[i].getDob());
                return db.DB[i];
            }
        }
        System.out.println("Sorry, this id " + id + " does NOT exist.");
        return null;
    }//search, check if it returns null
    
    
    public int count(){
        
        int result = db.getEmployeesNum();
        return result;
        
    }//count
    
    public void list(){
        
        db.getEmployee();
        for(int i = 0; i < db.getEmployeesNum(); i++){
            System.out.println(db.DB[i].getId() + " " + db.DB[i].getName()
                + " " + db.DB[i].getDob());
        }
        
    }//list
    
    //constr
    
    
}//class
