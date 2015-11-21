package tests;

import entities.Dice;

public class DiceTest2 {

	public static void main(String[] args) {
		
	//		Test om terning er symetrisk.
		Dice dice = new Dice(6);
		double test=10000000;
		int one =0, two =0, tree=0, four=0, five=0, six=0;
		
		for (int i=0; i<test; i++){
			dice.hitDice();
			if (dice.getSum()==1) one++;
			if (dice.getSum()==2) two++;
			if (dice.getSum()==3) tree++;
			if (dice.getSum()==4) four++;
			if (dice.getSum()==5) five++;
			if (dice.getSum()==6) six++;
		}
		System.out.print("Number of 1's: "+one+"\nNumber of 2's: "+two+"\nNumber of 3's: "+tree+"\nNumber of 4's: "+four+"\nNumber of 5's: "+five+"\nNumber of 6's: "+six);

	}

}
