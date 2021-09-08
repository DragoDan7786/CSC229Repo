/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author soblab
 */
public class Class1 {
    
    int id;
    String Name;
    int[] arr = {3, 5, 6, 1, 10};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    public static void main(String args[]){
       Class1 nc = new Class1();
       
       for(int i = 0 ; i < 5 ; i++){
           System.out.println("The value of of the array element of " + i + " is " + nc.arr[i]);
       }
        
        
        
        
    }
    
    
}
