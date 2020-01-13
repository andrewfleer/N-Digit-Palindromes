package com.andrewfleer.npalindrome;

public class NPalindrome {
	
	public static int createNDigitPalindromes(int n) {
		StringBuilder string = new StringBuilder();
		int sum = 0;
		
		// If n is less than 0, we shouldn't have any palindromes....or numbers.
		if (n <= 0) {
			return sum;
		} else {
			int smallestNumber = (int)Math.pow(10, n - 1); // The smallest number of N digits is 10^(N - 1)
			int largestNumber = (int)Math.pow(10, n) - 1;  // the largest number of N digits is (10^N) - 1;
			
			
			for (int i = smallestNumber; i <= largestNumber; i++)
				if (isPalindrome(i)) {
					sum += i;
					string.append(i + ", ");
				}
		}
		
		
		System.out.println(string);
		return sum;
	}

	private static boolean isPalindrome(int number) {
		String numberAsString = ((Integer) number).toString();
		String numberReversed = "";
		
		for (int i = numberAsString.length() -1; i >= 0; i--) {
			numberReversed = numberReversed + numberAsString.charAt(i);
		}
		
		if (numberAsString.equalsIgnoreCase(numberReversed)) {
			return true;
		}
		
		return false;
	}

}
