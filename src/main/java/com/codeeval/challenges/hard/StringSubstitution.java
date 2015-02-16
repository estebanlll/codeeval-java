package com.codeeval.challenges.hard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * {@link https://www.codeeval.com/open_challenges/50}
 * @author Esteban Lopez Valecky
 */
public class StringSubstitution {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));

		String text = null;
		while ((text = reader.readLine()) != null) {

			if ( text.isEmpty() ) continue;
			
			String[] conf = text.trim().split(";");
			String[] pairs = conf[1].split(",");
			
			String test = conf[0];
			
			for ( int n = 0, m = 1; m < pairs.length; n+=2, m+=2) {
				String f = pairs[n];
				String r = pairs[m].replace('0', 'a').replace('1', 'b');
				
				test = test.replaceFirst(f, r);
			}
			
			test = test.replace('a', '0').replace('b', '1');

			System.out.println(test);

		}

		if (reader != null) {
			reader.close();
		}
	}
	
}
