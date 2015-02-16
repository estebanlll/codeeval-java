package com.codeeval.challenges.easy;

import java.io.File;

/**
 * {@link https://www.codeeval.com/open_challenges/26}
 * @author Esteban Lopez Valecky
 */
public class FileSize {

	public static void main(String[] args) {
		
		File file = new File( args[0] );
		System.out.println( file.length() );

	}

}
