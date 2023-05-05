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
	        	// ITER_8
	        	capitaleNames.add(name.trim());
	        } else {
	        	// ITER_8
	        	minusculeNames.add(name.trim());
	        }
	    }
	    
	    StringBuilder chaine = new StringBuilder();
	    
	    // ITER_6, ITER_7 en partie
	    // ITER_1, ITER_4, ITER_5
	    if (!minusculeNames.isEmpty()) {
	        chaine.append("Hello, ");
//	        if (minusculeNames.size() == 2) {
//	        	chaine.append(formatName(minusculeNames.get(0)) + " and ");
	        if (minusculeNames.size() > 1) {
	            for (int i = 0; i < minusculeNames.size() - 2; i++) {
	            	chaine.append(formatName(minusculeNames.get(i)));
	            	chaine.append(", ");
	            }
	            chaine.append(formatName(minusculeNames.get(minusculeNames.size() - 2)) + " and ");
	        }
	        chaine.append(formatName(minusculeNames.get(minusculeNames.size() - 1)));
	    }
	    
	    // ITER_6, ITER_7 en partie
	    // ITER_3
	    if (!capitaleNames.isEmpty()) {
	        if (chaine.length() > 0) {
	            chaine.append(". AND ");
	        }
	        chaine.append("HELLO, ");
	        if (capitaleNames.size() > 1) {
		        for (int i = 0; i < capitaleNames.size() - 2; i++) {
		        	chaine.append(formatName(capitaleNames.get(i)));
		            chaine.append(", ");
		        }
		        chaine.append(formatName(capitaleNames.get(capitaleNames.size() - 2)) + " AND ");
	        }
	        chaine.append(capitaleNames.get(capitaleNames.size() - 1)).append(" !");
	    }

	    return chaine.toString();
		
	}
	
	private static String formatName(String name) {
        return name.trim().toUpperCase().charAt(0) + name.trim().substring(1);
    }

}
