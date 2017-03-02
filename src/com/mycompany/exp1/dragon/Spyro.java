/**
 * 
 */
package com.mycompany.exp1.dragon;

import com.mycompany.exp1.village.Village;

/**
 * @author anthony
 *
 */
public class Spyro extends Musho {
	private Village village2eat;
	
	public Spyro(Village village2eat){
		this.village2eat = village2eat;
	}
	/* (non-Javadoc)
	 * @see com.mycompany.exp1.dragon.Dragon#eatsvillage(com.mycompany.exp1.village.Village)
	 */
	@Override
	public boolean eatsvillage(Village village) {
		// TODO Auto-generated method stub
		return false;
	}


}
