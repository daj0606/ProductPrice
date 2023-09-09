package tests;
import model.ProductPriceLogic;
import model.Product;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestProductLogic1 {
	ProductPriceLogic productPL = new ProductPriceLogic();
	Product product = new Product();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateFinalBasePrice() {
		product.setPrice(19.99);
		String finalPrice = productPL.calculateFinalBasePrice(product);
		assertEquals("21.19", finalPrice);
	}
	
	@Test
	public void testCalculateFinalDiscountPrice() {
		product.setPrice(36.49);
		product.setDiscount(.20);
		String discountPrice = productPL.calculateFinalDiscountPrice(product);
		assertEquals("30.94", discountPrice);
	}
	
}
