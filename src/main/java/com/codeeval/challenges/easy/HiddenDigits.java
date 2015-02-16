package com.codeeval.challenges.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * {@link https://www.codeeval.com/open_challenges/122}
 * @author Esteban Lopez Valecky
 */
public class HiddenDigits {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));

		String text = null;
		while ((text = reader.readLine()) != null) {

			char[] chars = text.trim().toCharArray();

			StringBuffer line = new StringBuffer();

			for (int i = 0; i < chars.length; i++) {
				switch(chars[i]) {
					case 'a': line.append('0'); break;
					case 'b': line.append('1'); break;
					case 'c': line.append('2'); break;
					case 'd': line.append('3'); break;
					case 'e': line.append('4'); break;
					case 'f': line.append('5'); break;
					case 'g': line.append('6'); break;
					case 'h': line.append('7'); break;
					case 'i': line.append('8'); break;
					case 'j': line.append('9'); break;
					default:
						if ( Character.isDigit(chars[i]) ) {
							line.append(chars[i]);
						}
						break;
				}
				
			}

			if (line.length() > 0) {
				System.out.println(line.toString());
			} else {
				System.out.println("NONE");
			}

		}

		if (reader != null) {
			reader.close();
		}
	}

}
