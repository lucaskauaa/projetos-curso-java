package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Lucas");
		cookies.put("email", "lucas@gmail.com");
		cookies.put("phone", "988776655");
		
		cookies.remove("email");
		
		System.out.println("All cookies: ");
		
		cookies.put("phone", "988776644");
		
		System.out.println("Cookies contais key phone: " + cookies.containsKey("phone"));
		
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
