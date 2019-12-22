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
public class Inheritance extends Animal{
    //Declaration variable
    String animal = "frog";
   
    @Override
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("the " + animal + " says : groo grooo");
  }
}
