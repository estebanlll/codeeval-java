package com.codeeval.challenges.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * {@link https://www.codeeval.com/open_challenges/1}
 * @author Esteban Lopez Valecky
 */
public class FizzBuzz {

	public static void main( String[] args ) throws Exception {

		BufferedReader reader = new BufferedReader( new FileReader( new File( args[0] ) ) );

		String text = null;
		while ( ( text = reader.readLine() ) != null ) {
			
			String[] numbers = text.trim().split( " " );
			
			int fizz = Integer.parseInt( numbers[0] );
			int buzz = Integer.parseInt( numbers[1] );
			int count = Integer.parseInt( numbers[2] );
			
			StringBuffer result = new StringBuffer();
			
			for ( int i = 1; i < count; i++ ) {
				
				result.append( FizzBuzz.fizzbuzz( i, fizz, buzz ) ).append(" ");

			}
			
			result.append( FizzBuzz.fizzbuzz( count, fizz, buzz ) );
			
			System.out.println( result.toString() );
			text = null;
			
		}

		if ( reader != null ) {
			reader.close();
		}
		
	}
	
	private static String fizzbuzz( int position, int fizz, int buzz ) {
		String fizzbuzz;
		if ( (position % fizz) == 0 && (position % buzz) == 0 ) {
			fizzbuzz = "FB";
		} else if ( (position % fizz) == 0 ) {
			fizzbuzz = "F";
		} else if ( (position % buzz) == 0 ) {
			fizzbuzz = "B";
		} else {
			fizzbuzz = String.valueOf( position );
		}
		return fizzbuzz;
	}

}
