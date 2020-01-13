package com.andrewfleer.npalindrome.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.andrewfleer.npalindrome.NPalindrome;

public class NPalindromeTest {
	protected int negativeOne, zero, one, two, three, four, five;
	
	@Before
	public void setUp() {
		negativeOne = -1;
		zero = 0;
		one = 1;
		two = 2;
		three = 3;
		four = 4;
		five = 5;
	}
	
	@Test
	public void testNegativeOne() {
		int sum = NPalindrome.createNDigitPalindromes(negativeOne);
		
		assertTrue(sum == 0);
	}
	
	@Test
	public void testZero() {
		int sum = NPalindrome.createNDigitPalindromes(zero);
		
		assertTrue(sum == 0);
	}

	@Test
	public void testOneDigit() {
		int sum = NPalindrome.createNDigitPalindromes(one);
		
		assertTrue(sum == 45);
	}
	
	@Test
	public void testTwoDigits() {
		int sum = NPalindrome.createNDigitPalindromes(two);
		
		assertTrue(sum == 495);
	}
	
	@Test
	public void testThreeDigits() {
		int sum = NPalindrome.createNDigitPalindromes(three);
		
		assertTrue(sum == 49500);
	}
	
	@Test
	public void testFourDigits() {
		int sum = NPalindrome.createNDigitPalindromes(four);
		
		assertTrue(sum == 495000);
	}
	
	@Test
	public void testFiveDigits() {
		int sum = NPalindrome.createNDigitPalindromes(five);
		
		assertTrue(sum == 49500000);
	}
}
