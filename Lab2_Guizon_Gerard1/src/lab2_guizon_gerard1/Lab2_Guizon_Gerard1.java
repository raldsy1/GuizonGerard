/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_guizon_gerard1;

/**
 *
 * @author Asus
 */
import java.util.Scanner;   
public class Lab2_Guizon_Gerard1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
           System.out.println("Enter Number: ");
         Scanner input = new Scanner(System.in);
          num = input.nextInt();
         
           
           
           if ( num % 2 == 0)
           System.out.println("Entered number is Even");
           else
           System.out.println("Entered number is Odd");
    
    }
    
}
