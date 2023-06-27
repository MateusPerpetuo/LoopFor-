
package javaapplicationfor;

import java.util.Scanner;

/**
 *
 * @author mateus.perpetuo
 */
public class JavaApplicationFor {


    public static void main(String[] args) {
        
     String productName;
     float costPrice, sellingPrice;
     float overallCost =  0.0f; 
     float overallSales = 0.0f;
     int i = 0;
     Scanner scan = new Scanner(System.in);
     
     
     for (; i < 40; i++){
         
         System.out.println("Enter the product's name: ");
         productName =  scan.nextLine();
         scan.nextLine();
                 
         System.out.println("Enter the product's cost price: ");
         costPrice =  scan.nextFloat();
         
         System.out.println("Enter the product's selling price: ");
         sellingPrice =  scan.nextFloat();
         
         
         // storing and calculating the overall values
         
         overallCost = overallCost + costPrice;
         overallSales =  overallSales +sellingPrice; 
         
         // financial return check
         
         if (costPrice == sellingPrice){
                    
            System.out.println("There was no profit or loss, it broke even.");
             
         } else {
             
             if (costPrice > sellingPrice){
                
                 System.out.println("We incurred a loss as the production" 
                         + " cost exceeded the selling price.");
                 
             } else{
                 
                 System.out.println("We made a profit as the selling price"
                         +" exceeded the production cost.");
             }
         }
         System.out.println("");
         System.out.println(productName + ", cost price is = "+ costPrice +
                 ", and the selling price is = " + sellingPrice);
         System.out.println("");
         
     }
        System.out.println("");
        System.out.println("The overall cost prices is: " + overallCost);
        System.out.println("The overall selling is: " + overallSales);
        System.out.println("And your profit is: " + (overallSales - overallCost));
    }
    
}
