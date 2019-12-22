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
public class Encapsulation_ extends Animal{
    @Override
    public void animalSound(){
        Encapsulation cat = new Encapsulation();
        
        //Setting value
        cat.setAnimalsound("the cat says : meoww meoww");
        
        //Take attribute values
        System.out.println(cat.getAnimalsound());
    }
    
}
