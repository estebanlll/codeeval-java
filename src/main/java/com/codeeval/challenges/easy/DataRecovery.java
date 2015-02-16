package com.codeeval.challenges.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * {@link https://www.codeeval.com/open_challenges/140}
 * @author Esteban Lopez Valecky
 */
public class DataRecovery {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));

		String text = null;
		while ((text = reader.readLine()) != null) {

			if (text.isEmpty()) continue;
			
			String[] conf = text.split(";");
			
			String[] words = conf[0].split(" ");
			String[] wOrder = conf[1].split(" ");
			
			StringBuffer line = new StringBuffer();
			
			for (int i = 0; i < words.length; i++) {
				boolean found = false;
				for (int j = 0; j < wOrder.length; j++) {
					int pos = Integer.parseInt(wOrder[j]);
					if ( pos == i+1) {
						line.append(words[j]).append(' ');
						found = true;
					}
				}
				if (!found) {
					line.append("@ ");
				}
			}

			System.out.println(line.toString().replace("@", words[words.length-1]).trim());

		}

		if (reader != null) {
			reader.close();
		}
	}
	
}
