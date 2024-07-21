package org.formacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problema {
	
	public static void main (String[] args) {
		
		List<String> nombres = Arrays.asList("Juan", "Antonia", "Pedro");
		
		Collections.sort(nombres,(o1, o2) -> o1.length() - o2.length());
				
		System.out.println(nombres);
	}

}
