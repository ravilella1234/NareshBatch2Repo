package icici.loans.collections;

import java.util.HashMap;
import java.util.Map;

public class FibonacciCache 
{
	private Map<Integer, Integer> cache = new HashMap<>();

    public int fibonacci(int n) 
    {
        if (n <= 1) return n;
        if (cache.containsKey(n)) return cache.get(n);

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) 
    {
        FibonacciCache fib = new FibonacciCache();
        System.out.println("Fibonacci of 10: " + fib.fibonacci(10));
    }

}
