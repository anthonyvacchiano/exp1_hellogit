/**
 * 
 */
package com.mycompany.exp1;

import com.mycompany.exp1.dragon.Dragon;
import com.mycompany.exp1.dragon.Musho;
import com.mycompany.exp1.dragon.Spyro;
import com.mycompany.exp1.village.Village;
/**
 * @author anthony
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dragon musho = new Musho();
		
		Village village2eat = new Village (2);
		Dragon spyro = new Spyro(village2eat);
	}

}
