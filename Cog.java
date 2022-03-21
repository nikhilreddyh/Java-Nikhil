

import java.util.*;

public class Cog {

	public static int binomial_coefficient(int n, int m)
	{
		int res = 1;

		if (m > n - m)
			m = n - m;

		for (int i = 0; i < m; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}

		return res;
	}

	
	public static int calculate_ways(int m, int n)
	{

		
		if (m < n) {
			return 0;
		}

	
		int ways = binomial_coefficient(n + m - 1, n - 1);
		return ways;
	}


	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

		int result = calculate_ways(m, n);
		System.out.println(Integer.toString(result));

		System.exit(0);
	}
}
