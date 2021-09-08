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
    Class1 nxt;
    Class1(int theID){this.id = theID;}
    
    @Override
    public String toString(){
        return "Class id is " + this.id;
    }
    
}
