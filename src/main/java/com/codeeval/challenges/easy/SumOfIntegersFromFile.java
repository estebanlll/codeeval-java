package com.codeeval.challenges.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * {@link https://www.codeeval.com/open_challenges/24}
 * @author Esteban Lopez Valecky
 */
public class SumOfIntegersFromFile {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader( new FileReader( new File( args[0] ) ) );

		int sum = 0;
		String text = null;
		while ( ( text = reader.readLine() ) != null ) {
			
			text = text.trim();
			if ( text.isEmpty() ) {
				continue;
			}

			sum += Integer.parseInt( text );
			
		}
		
		System.out.println( sum );

		if ( reader != null ) {
			reader.close();
		}
	
	}

}
