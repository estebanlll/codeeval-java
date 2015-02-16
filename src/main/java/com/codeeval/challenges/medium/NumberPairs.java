package com.codeeval.challenges.medium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * {@link https://www.codeeval.com/open_challenges/34}
 * @author Esteban Lopez Valecky
 */
public class NumberPairs {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader( new FileReader( new File( args[0] ) ) );

		String text = null;
		while ( ( text = reader.readLine() ) != null ) {
			
			text = text.trim();
			if ( text.isEmpty() ) {
				continue;
			}

			String[] conf = text.split(";");
			
			String[] numbers = conf[0].split(",");
			
			int div = Integer.parseInt( conf[1] );
			
			StringBuffer line = new StringBuffer();
			
			boolean sep = false;
			
			for ( int i = 0; i < numbers.length; i++ ) {

				int a = Integer.parseInt( numbers[i] );
				
				for ( int j = numbers.length - 1; j > i; j-- ) {
					
					int b = Integer.parseInt( numbers[j] );
					
					if ( (a + b) == div ) {
						
						if ( sep ) {
							line.append(';');
						}
						
						line.append(a).append(',').append(b);
						sep = true;
						break;
						
					}
					
				}
				
			}
			
			if ( line.length() > 0 ) {
				System.out.println( line.toString() );
			} else {
				System.out.println( "NULL" );
			}
			
		}
		
		if ( reader != null ) {
			reader.close();
		}

	}

}
