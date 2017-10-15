// DiscountRate.java
// JAC444 assignment 1 - task 1 
// October 14th, 2017
// Coded with love and passion by Anton Elistratov
package assignment1_task1;

public class DiscountRate {
	
	private static double serviceDiscountPremium = 0.2;
	private static double serviceDiscountGold = 0.15;
	private static double serviceDiscountSilver = 0.1;
	private static double productDiscountPremium = 0.1;
	private static double productDiscountGold = 0.1;
	private static double productDiscountSilver = 0.1;
	
	public double getServiceDiscount(String discountType) {
		double discount = 1;
		
		if (discountType == "Premium")
			discount = serviceDiscountPremium;
		if (discountType == "Gold")
			discount = serviceDiscountGold;
	    if (discountType == "Silver")
	    	discount = 	serviceDiscountSilver;
	    
		return discount;
	}
	
	public double getProductDiscount(String discountType) {
		double discount = 1;
		
		if (discountType == "Premium")
			discount = productDiscountPremium;
		if (discountType == "Gold")
			discount = productDiscountGold;
	    if (discountType == "Silver")
	    	discount = 	productDiscountSilver;
		
		return discount;
	}
} // DiscountRate
