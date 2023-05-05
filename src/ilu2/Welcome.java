package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		
		// ITER_2
		if (input == null || input.trim().isEmpty()) {
            return "Hello, my friend";
        }
		
		String[] inputs = input.split(",");
		
		// ITER_1, ITER_3, ITER_4
        if (inputs.length == 1) {
        	
        	// ITER_3
    		if (input.equals(input.toUpperCase())) {
                return "HELLO, " + input.toUpperCase() + " !";
            }
    		
    		// ITER_1
            return "Hello, " + formatName(input);
        } else {
        	// ITER_4
            return "Hello, " + formatName(inputs[0]) + ", " + formatName(inputs[1]);
        }
		
	}
	
	private static String formatName(String name) {
        return name.trim().toUpperCase().charAt(0) + name.trim().substring(1);
    }

}
