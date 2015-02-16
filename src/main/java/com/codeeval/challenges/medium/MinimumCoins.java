package com.codeeval.challenges.medium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * {@link https://www.codeeval.com/open_challenges/74}
 * @author Esteban Lopez Valecky
 */
public class MinimumCoins {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));

		String text = null;
		while ((text = reader.readLine()) != null) {

			int amount = Integer.parseInt(text.trim());
			
			int coins = 0;
			
			while (amount > 0) {
				if (amount >= 5) {
					amount -= 5;
				} else if (amount >=3) {
					amount -= 3;
				} else if (amount >= 1) {
					amount--;
				}
				coins++;
			}

			System.out.println(coins);

		}

		if (reader != null) {
			reader.close();
		}
	}

}
