/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package lottery;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Hakan
 */
public class Lottery {

    /**
     * @param args the command line arguments
     */
    
    public static void lottery() {
        System.out.println("Welcome! \nPlease press 'p' to play lottery game or press 'e' to exit the game... \n");
        
        Scanner input = new Scanner(System.in);
        char choice = input.next().toLowerCase().charAt(0);
        
        if (choice == 'e') {
            System.out.println("\nExiting the game...");
            System.exit(0);
        }
        
        else if (choice == 'p') {
            System.out.println("\nStarting the game...");
            
            System.out.println("\nAll numbers:");
            
            ArrayList<Integer> lottery = new ArrayList<Integer>();
            ArrayList<Integer> lucky = new ArrayList<Integer>();

            for(int i=1; i<=90; i++) {
            lottery.add(i);
                System.out.print(i + " ");
                if (i % 10 == 0) {
                    System.out.println("");
                }
            }
            
            System.out.println("");
            
            while(true) {
                if (lottery.isEmpty()) {
                    System.out.println("\nNo more numbers left... The lottery game is over...");
                    break; // Loop will exit as there are no numbers left
                }                

                for(int i=1; i<=lottery.size(); i++) {
                    System.out.println("\n\nPlease press 'p' to generate number or press 'e' to exit the game... \n");
                    char c = input.next().toLowerCase().charAt(0);
                    
                    if (c == 'e') {
                        System.out.println("Exiting the game... \n");
                        System.exit(0);
                    }
                    
                    else if (c == 'p') {
                        int randomIndex = (int)(Math.random() * lottery.size());
                        int randomNumber = lottery.get(randomIndex);
                        
                        lucky.add(randomNumber);
                        lottery.remove(randomIndex);
                        
                        System.out.println("\nGenerated number: " + randomNumber);
                        
                        System.out.println("\nRemaining numbers:");
                        
                        for (i = 0; i < lottery.size(); i++) {
                            System.out.print(lottery.get(i) + " ");
                            if ((i + 1) % 10 == 0) {
                                System.out.println("");
                            }
                        }
                    
                        System.out.println("\n\nLucky numbers:");

                        for (i = 0; i < lucky.size(); i++) {
                            System.out.print(lucky.get(i) + " ");
                            if ((i + 1) % 10 == 0) {
                                System.out.println("");
                            }
                        }

                    }
                    
                    else {
                        System.out.println("Invalid input. Please press 'p' to generate number or press 'e' to exit the game... \n");
                    }
                    
                }
                
            }            
            
        }
        
        else {
            System.out.println("Error... Terminating the program... \n");
            System.exit(0);
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        lottery();
    }
    
}