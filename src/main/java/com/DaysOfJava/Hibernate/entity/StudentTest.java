/**
 * 
 */
package com.DaysOfJava.Hibernate.entity;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.Test;

/**
 * Parasoft Jtest UTA: Test class for Student
 *
 * @see com.DaysOfJava.Hibernate.entity.Student
 * @author ACER
 */
public class StudentTest {

	/**
	 * Parasoft Jtest UTA: Test for getLastName()
	 *
	 * @see com.DaysOfJava.Hibernate.entity.Student#getLastName()
	 * @author ACER
	 */
	@Test
	public void testGetLastName() throws Throwable {
		// UTA is unable to resolve the values required to create the requested test case.
		// A test case with default values has been created instead.

		assertTimeoutPreemptively(ofMillis(5000), () -> {
			// Given
			Student underTest = new Student();

			// When
			String result = underTest.getLastName();

			// Then - assertions for result of method getLastName()
			assertNull(result);

			// Then - assertions for this instance of Student
			assertAll(() -> {
				assertEquals(0, underTest.getId());
			}, () -> {
				assertNull(underTest.getFirstName());
			}, () -> {
				assertNull(underTest.getEmail());
			});

		});
	}
}