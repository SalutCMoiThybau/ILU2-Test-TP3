package ilu2;

import java.util.ArrayList;
import java.util.List;

public class Welcome {
	
	public static String welcome(String input) {
		
		// ITER_2
		if (input == null || input.trim().isEmpty()) {
            return "Hello, my friend";
        }
		
		String[] names = input.split(",");
	    List<String> capitaleNames = new ArrayList<>();
	    List<String> minusculeNames = new ArrayList<>();
	    for (String name : names) {
//	        if (name.trim().equals("")) {
//	            return "Il n'y a pas que des noms !";
//	        }
	        if (name.toUpperCase().equals(name)) {
	        	capitaleNames.add(name.trim());
	        } else {
	        	minusculeNames.add(name.trim());
	        }
	    }
	    
	    StringBuilder chaine = new StringBuilder();
	    
	    // ITER_6 en partie
	    // ITER_1, ITER_4, ITER_5
	    if (!minusculeNames.isEmpty()) {
	        chaine.append("Hello, ");
	        for (int i = 0; i < minusculeNames.size() - 1; i++) {
	            chaine.append(formatName(minusculeNames.get(i))).append(", ");
	        }
	        chaine.append(formatName(minusculeNames.get(minusculeNames.size() - 1)));
	        if (!capitaleNames.isEmpty()) {
	            chaine.append(".");
	        }
	    }
	    
	    // ITER_6 en partie
	    // ITER_3
	    if (!capitaleNames.isEmpty()) {
	        if (chaine.length() > 0) {
	            chaine.append(" AND ");
	        }
	        chaine.append("HELLO, ");
	        for (int i = 0; i < capitaleNames.size() - 1; i++) {
	            chaine.append(capitaleNames.get(i).toUpperCase()).append(", ");
	        }
	        chaine.append(capitaleNames.get(capitaleNames.size() - 1).toUpperCase()).append(" !");
	    }

	    return chaine.toString();
		
	}
	
	private static String formatName(String name) {
        return name.trim().toUpperCase().charAt(0) + name.trim().substring(1);
    }

}
