// Customer.java
// JAC444 assignment 1 - task 1 
// October 14th, 2017
// Coded with love and passion by Anton Elistratov
package assignment1_task1;

public class Customer {

  private String fullName;
  private boolean member = false;
  private String memberType;

  public Customer(String fullName, boolean member, String memberType){
    this.fullName   = fullName;
    this.member     = member;
    this.memberType = memberType;
  }

  public String getName() {
    return fullName;
  }

  public boolean isMember() {
    return member;
  }

  public void setMember(boolean member) {
    this.member = member;
  }

  public String getMemberType() {
    return memberType;
  }

  public void setMemberType(String memberType) {
    this.memberType = memberType;
  }

  public String toString() {
    return String.format("[fullName = %s, member = %s, memberType = %s]", getName(), String.valueOf(isMember()), getMemberType());
  }
} // Customer
