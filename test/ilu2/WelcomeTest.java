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
	
	// tests de ITER_4, ITER_7
	@Test
    void testIter4() {
		String helloTwo = "Hello, Bob and Alice";
        assertEquals(Welcome.welcome("bob,alice"), helloTwo);
        assertEquals(Welcome.welcome("bob, alice"), helloTwo);
        assertEquals(Welcome.welcome("  bob  ,   alice  "), helloTwo);
    }
	
	// test de ITER_5, ITER_7
	@Test
	void testIter5() {
	    assertEquals(Welcome.welcome("Amy, bob,jerry"), "Hello, Amy, Bob and Jerry");
	}
	
	// tests de ITER_6, ITER_7
	@Test
	void testIter6() {
		assertEquals(Welcome.welcome("Amy, BOB, Jerry"), "Hello, Amy and Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("AMY, BOB, JERRY"), "HELLO, AMY, BOB AND JERRY !");
	}
	
	// tests de ITER_7
	@Test
	void testIter7() {
		assertEquals(Welcome.welcome("Bob, Amy, Jerry"), "Hello, Bob, Amy and Jerry");
		assertEquals(Welcome.welcome("BOB, Amy,"), "Hello, Amy. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("BOB, Amy, Jerry"), "Hello, Amy and Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("Bob, AMY, Jerry, JACK"), "Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
	}

}
