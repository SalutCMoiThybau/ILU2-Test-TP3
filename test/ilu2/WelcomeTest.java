package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	// test de la classe
	@Test
	void testWelcome() {
		assertNotNull(new Welcome());
	}
	
	// test de ITER_1
	@Test
	void testIter1() {
		assertEquals(Welcome.welcome("bob"), "Hello, Bob");
	}
	
	// tests de ITER_2
	@Test
    public void testIter2() {
		String helloMF = "Hello, my friend";
        assertEquals(helloMF, Welcome.welcome(""));
        assertEquals(helloMF, Welcome.welcome(" "));
        assertEquals(helloMF, Welcome.welcome(null));
    }

}
