// DiscountSystem.java
// JAC444 assignment 1 - task 1 
// October 14th, 2017
// Coded with love and passion by Anton Elistratov
package assignment1_task1;
import java.text.DecimalFormat; // Float format
import java.util.Date; // Date variable

public class DiscountSystem {

  public static void main(String[] args) {

    // services
    double haircut = 25.99;
    double spa     = 39.99;
    
    //products
    double aftershave  = 6.99;
    double shavingfoam = 5.99;
    double shampoo     = 3.99;
    double hairspray   = 3.99;
    
    // date
    Date date = new Date();
    
    // output
    DecimalFormat df = new DecimalFormat("#.00");
    
    // Test Data
    Visit v1 = new Visit ("Mahboob", true, "Premium", date );
    Visit v2 = new Visit ("Jordan", true, "Gold", date);
    Visit v3 = new Visit ("Tony", false, "None", date);
      
    // visit 1
    v1.setServiceExpense(spa);
    v1.setProductExpense(shavingfoam + aftershave);
    
    // visit
    v2.setServiceExpense(haircut + spa);
    v2.setProductExpense(shampoo);
    
    // visit 3
    v3.setServiceExpense(spa);
    v3.setProductExpense(shampoo + hairspray);
    
    Visit[] allVisits = new Visit[3];
    allVisits[0] = v1;
    allVisits[1] = v2;
    allVisits[2] = v3;
    
    System.out.println("------------->All visit objects<------------");
    for (int i = 0; i < allVisits.length; i++) {
      System.out.println(allVisits[i]);
      System.out.println();
    }
    System.out.println("--------------------------------------------");
    
    System.out.println();

    System.out.println("--------->Services & Products total<--------");
    for (int i = 0; i < allVisits.length; i++) {
      System.out.println("Customer " + allVisits[i].getName() + " spent " + df.format(allVisits[i].getTotalExpense()) + " total.");
      System.out.println();
    }
    System.out.println("--------------------------------------------");
  } // main
} // DiscountSystem
