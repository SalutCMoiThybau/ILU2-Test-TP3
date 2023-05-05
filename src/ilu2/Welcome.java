package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		
		// ITER_2
		if (input == null || input.trim().isEmpty()) {
            return "Hello, my friend";
        }
		
		String[] inputs = input.split(",");
		
		// ITER_1, ITER_3, ITER_4, ITER_5
        if (inputs.length == 1) {
        	
        	// ITER_3
    		if (input.equals(input.toUpperCase())) {
                return "HELLO, " + input.toUpperCase() + " !";
            }
    		
    		// ITER_1
            return "Hello, " + formatName(input);
        } else {
        	
			// ITER_4, ITER_5
			StringBuilder chaine = new StringBuilder("Hello,");
			for (String name : inputs) {
			    chaine.append(" ").append(formatName(name.trim()));
			    if (!name.equals(inputs[inputs.length - 1])) {
			        chaine.append(",");
			    }
			}
            return chaine.toString();
        }
		
	}
	
	private static String formatName(String name) {
        return name.trim().toUpperCase().charAt(0) + name.trim().substring(1);
    }

}
