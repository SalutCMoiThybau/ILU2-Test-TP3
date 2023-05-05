package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		
		// ITER_2
		if (input == null || input.trim().isEmpty()) {
            return "Hello, my friend";
        }
		// ITER_3
		else if (input.equals(input.toUpperCase())) {
            return "HELLO, " + input.toUpperCase() + " !";
        }
		// ITER_1
		return "Hello, " + input.substring(0, 1).toUpperCase() + input.substring(1);
	}

}
