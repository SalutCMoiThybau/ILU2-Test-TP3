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
    void testIter2() {
		String helloMF = "Hello, my friend";
        assertEquals(Welcome.welcome(""), helloMF);
        assertEquals(Welcome.welcome(" "), helloMF);
        assertEquals(Welcome.welcome(null), helloMF);
    }
	
	// test de ITER_3
	@Test
    void testIter3() {
        assertEquals(Welcome.welcome("JERRY"), "HELLO, JERRY !");
    }
	
	// tests de ITER_4
	@Test
    void testIter4() {
		String helloTwo = "Hello, Bob, Alice";
        assertEquals(Welcome.welcome("bob,alice"), helloTwo);
        assertEquals(Welcome.welcome("bob, alice"), helloTwo);
        assertEquals(Welcome.welcome("  bob  ,   alice  "), helloTwo);
    }
	
	// test de ITER_5
	@Test
	void testIter5() {
	    assertEquals(Welcome.welcome("Amy, bob,jerry"), "Hello, Amy, Bob, Jerry");
	}
	
	// tests de ITER_6
	@Test
	void testIter6() {
		assertEquals(Welcome.welcome("Amy, BOB, Jerry"), "Hello, Amy, Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("AMY, BOB, JERRY"), "HELLO, AMY, BOB, JERRY !");
	}

}
