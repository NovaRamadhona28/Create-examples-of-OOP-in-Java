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
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal goat = new Abstraction() { //Create a Goat object
            @Override
            public void animalSound() {
                // The body of animalSound() is provided here
                System.out.println("the goat says : mbee mbee");            }
        };
        
        //Create object from animal class
        Animal animal = new Animal();
        //Create object from Inheritance class
        Animal frog = new Inheritance();
        //Create object from Encapsulation_ class
        Animal cat = new Encapsulation_();
        
        //call animalsound from Animal class
        animal.animalSound();
        //call animalsound from inheritance class
        frog.animalSound();
        //call animalsound from Encapsulation_ class 
        cat.animalSound();
        //call animalsound from Abstraction class
        goat.animalSound();
    }
    
}
