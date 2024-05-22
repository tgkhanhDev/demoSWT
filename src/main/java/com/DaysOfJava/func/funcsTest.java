/**
 * 
 */
package com.DaysOfJava.func;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for funcs
 *
 * @see com.DaysOfJava.func.funcs
 * @author ACER
 */
public class funcsTest {

	/**
	 * Parasoft Jtest UTA: Test for convertPointToChar(int)
	 *
	 * @see com.DaysOfJava.func.funcs#convertPointToChar(int)
	 * @author ACER
	 */
	@Test
	public void testConvertPointToChar_F() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test
		// case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			funcs underTest = new funcs();

			// When
			int num = 0; // UTA: default value
			String result = underTest.convertPointToChar(num);

			// Then - assertions for result of method convertPointToChar(int)
			assertEquals("F", result);

		});
	}

	@Test
	public void testConvertPointToChar_C() {
		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			funcs underTest = new funcs();

			// When
			int num = 6;
			String result = underTest.convertPointToChar(num);

			// Then
			assertEquals("C", result);
		});
	}

	@Test
	public void testConvertPointToChar_B() {
		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			funcs underTest = new funcs();

			// When
			int num = 7;
			String result = underTest.convertPointToChar(num);

			// Then
			assertEquals("B", result);
		});
	}

	@Test
	public void testConvertPointToChar_BPlus() {
		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			funcs underTest = new funcs();

			// When
			int num = 8;
			String result = underTest.convertPointToChar(num);

			// Then
			assertEquals("B+", result);
		});
	}

	@Test
	public void testConvertPointToChar_A() {
		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			funcs underTest = new funcs();

			// When
			int num = 9;
			String result = underTest.convertPointToChar(num);

			// Then
			assertEquals("A", result);
		});
	}

	@Test
	public void testConvertPointToChar_APlus() {
		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			funcs underTest = new funcs();

			// When
			int num = 10;
			String result = underTest.convertPointToChar(num);

			// Then
			assertEquals("A+", result);
		});
	}

	@Test
	public void testConvertPointToChar_Invalid() {
		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			funcs underTest = new funcs();

			// When
			int num = 11;
			String result = underTest.convertPointToChar(num);

			// Then
			assertEquals("Invalid", result);
		});
	}

	@Test
	public void testConvertPointToChar_Negative() {
		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			funcs underTest = new funcs();

			// When
			int num = -1;
			String result = underTest.convertPointToChar(num);

			// Then
			assertEquals("F", result);
		});
	}

}