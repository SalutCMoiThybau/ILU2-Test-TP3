package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	// test de la classe
	@Test
	void testWelcomeClass() {
		assertNotNull(new Welcome());
	}
	
	// test de ITER_1
	@Test
	void testWelcome() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}

}
