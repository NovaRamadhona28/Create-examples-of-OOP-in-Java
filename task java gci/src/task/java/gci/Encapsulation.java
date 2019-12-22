/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.java.gci;

/**
 *
 * @author Nova Ramadhona
 */
public class Encapsulation extends Animal{
    private String animalsound;
   
    //Create getter, call in Mainclass class, Encapsulation.java
    public String getAnimalsound(){
        return animalsound;
    }
    
    //Create setter, call in Mainclass class, Encapsulation.java
    public void setAnimalsound(String Animalsound){
        this.animalsound = Animalsound;
    }
    
    
    
   
}
