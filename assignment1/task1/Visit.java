// Visit.java
// JAC444 assignment 1 - task 1 
// October 14th, 2017
// Coded with love and passion by Anton Elistratov
package assignment1_task1;
import java.util.Date; // Date variable

public class Visit {

  DiscountRate discount = new DiscountRate(); // 

  Customer customer;
  Date date;
  private double serviceExpense = 0;
  private double productExpense = 0;

  public Visit(String fullName, boolean member, String memberType, Date date) {
    this.customer = new Customer(fullName, member, memberType);
      this.date = date;
  }
  
  public String getName() {
    return this.customer.getName();
  }
  
  public double getServiceExpense() {
    return serviceExpense;
  }
  
  public void setServiceExpense(double serviceExpense) {
    if (customer.isMember()){
      this.serviceExpense = serviceExpense - (serviceExpense * discount.getServiceDiscount(customer.getMemberType()));		
    } else {
      this.serviceExpense = serviceExpense;
    }
  }
  
  public double getProductExpense() {
    return productExpense;
  }
  
  public void setProductExpense(double productExpense) {
    if (customer.isMember()) {
      this.productExpense = productExpense - (productExpense * discount.getProductDiscount(customer.getMemberType()));
    } else {
      this.productExpense = productExpense;
    }
  }
  
  public double getTotalExpense() {
    return productExpense + serviceExpense; // total
  }
  
  public String toString() {
    return this.customer.toString() + String.format("[date = %s]", String.valueOf(date));
  }
} // Visit
