/*
 * Peter Horne-Deus
 * This program simulates two dogs meeting
 * TwoDogsMeet.java
 * March 9, 2020
 */

package twodogsmeet;

import javax.swing.*;

/**
 *
 * @author pehor9164
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Two Dog's will be simulated\n" +
                "Please enter the Following information:");
        Boolean good = false;
        do{  
            //User input
            String name1 = JOptionPane.showInputDialog("Enter the first dogs name");
            String name2 = JOptionPane.showInputDialog("Enter the second dogs name");
            String breed1 = JOptionPane.showInputDialog("Enter the first dogs breed");
            String breed2 = JOptionPane.showInputDialog("Enter the second dogs breed");

            Dog dog1 = new Dog(name1, breed1);
            Dog dog2 = new Dog(name2, breed2);

            //Values for dog1
            System.out.println("First Dogs Info:\n");
            System.out.println(dog1.getName() + "'s Aggression: "
              + dog1.getAggression());
            System.out.println(dog1.getName() + "'s Hunger: "
              + dog1.getHunger());
            System.out.println(dog1.getName() + "'s Age: "
              + dog1.getAge() + "\n");
            //Values for dog2
            System.out.println("Second Dogs Info:\n");
            System.out.println(dog2.getName() + "'s Aggression: "
              + dog2.getAggression());
            System.out.println(dog2.getName() + "'s Hunger: "
              + dog2.getHunger());
            System.out.println(dog2.getName() + "'s Age: "
              + dog2.getAge() + "\n");

            //Factors control behaviour
            if (dog1.getAggression() > 5 || dog1.getHunger() > 5) {
              //dog1 is aggressive
              System.out.print(dog1.getName() + ": ");
              dog1.barkAngry();
            } else {
              //dog1 is not aggressive
              System.out.print(dog1.getName() + ": ");
              dog1.barkFriendly();
            }

            if (dog2.getAggression() > 5 || dog2.getHunger() > 5) {
              //dog2 is aggressive
              System.out.print(dog2.getName() + ": ");
              dog2.barkAngry();
            } else {
              //dog2 is not aggressive
              System.out.print(dog2.getName() + ": ");
              dog2.barkFriendly();
            }
            int test = JOptionPane.showConfirmDialog(null, "Would you like to simulate again?");
            System.out.println(test);
            if(test == 1){
                good = true;
            }
        }while(good == false);
  }
}

    
