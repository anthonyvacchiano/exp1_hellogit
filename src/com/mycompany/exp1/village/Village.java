package com.mycompany.exp1.village;


public class Village implements com.mycompany.exp1.village.HasVillagers {
	private int numberofvillagers;
	 public Village(int numberofvillagers){
		this.numberofvillagers = numberofvillagers;
	}
	public int countOfVillagers() {
		return numberofvillagers;
	}
	public int addvillagers(int addedvillagers)
	{
		numberofvillagers += addedvillagers;
		return numberofvillagers;
	}
	@Override
	public int countofVillagers() {
		// TODO Auto-generated method stub
		return 0;
	}

}
