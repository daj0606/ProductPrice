package model;

import java.text.DecimalFormat;

public class ProductPriceLogic {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public String calculateFinalBasePrice(Product product) {
		double afterTax = product.getPrice() + (product.getPrice() * .06);
		String finalPrice = df.format(afterTax);
		
		return finalPrice;
	}
	
	public String calculateFinalDiscountPrice(Product product) {
		double beforeTax = product.getPrice() - (product.getPrice() * product.getDiscount());
		double afterTax =  beforeTax + (beforeTax * .06);
		String finalPrice = df.format(afterTax);
		
		return finalPrice;
	}
	
	public boolean isFreeShipping(Product product) {
		
		if (product.getPrice() >= 50) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
