package icici.loans.collections;

import java.util.HashMap;
import java.util.Map;

public class ProductPriceLookup 
{
	public static void main(String[] args) 
	{
		 Map<String, Double> productPrices = new HashMap<>();
	     productPrices.put("Laptop", 899.99);
	     productPrices.put("Tablet", 299.99);
	     productPrices.put("Smartphone", 699.99);
	
	     // Check price for a specific product
	     String product = "Laptop";
	     Double price = productPrices.get(product);
	     if (price != null) 
	     {
	         System.out.println(product + " costs $" + price);
	     } 
	     else 
	     {
	         System.out.println("Product not found");
	     }
 }

}
