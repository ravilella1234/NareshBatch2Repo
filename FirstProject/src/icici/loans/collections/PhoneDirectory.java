package icici.loans.collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory 
{
	public static void main(String[] args) 
	{
        Map<String, String> phoneDirectory = new HashMap<>();
        phoneDirectory.put("John", "123-456-7890");
        phoneDirectory.put("Jane", "234-567-8901");
        phoneDirectory.put("Jake", "345-678-9012");

        // Retrieve a phone number by name
        String johnNumber = phoneDirectory.get("John");
        System.out.println("John's Number: " + johnNumber);
	}
}
