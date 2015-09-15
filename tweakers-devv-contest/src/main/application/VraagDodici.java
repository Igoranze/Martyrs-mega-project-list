package main.application;

public class VraagDodici {

	public static void main(String[] args){
		int totalWarriorOverkill = 
				Attack(300)+
				Attack(600)+
				Attack(850)+
				Attack(900)+
				Attack(1100)+
				Attack(3500);

		System.out.println("Total Warrior Overkill: "+totalWarriorOverkill);
	}

	public static int Attack(int hitpointsMonster){
		System.out.println("The fight begins! Monster has "+hitpointsMonster+" HP!");
		int time = 0;

		while(true){
			System.out.println("Time in seconds: "+time);
			// Warrior Attacks
			if(time % 4 == 0){
				hitpointsMonster -=35;
				System.out.println("The warrior deals 35 HP damage!");
				System.out.println("The monster still has "+hitpointsMonster+" HP!");
				if(hitpointsMonster<0){
					System.out.println("Warrior overkill: "+Math.abs(hitpointsMonster));
					System.out.println("Monster died!");
					System.out.println("");
					return Math.abs(hitpointsMonster);
				}
			}

			// Mage attacks
			if (time>=2 && (time-2)%8==0){
				hitpointsMonster -=80;
				System.out.println("The mage deals 80 HP damage!");
				System.out.println("The monster still has "+hitpointsMonster+" HP!");
				if(hitpointsMonster<0){
					System.out.println("Mage overkill: "+Math.abs(hitpointsMonster));
					System.out.println("Monster died!");
					System.out.println("");
					return 0;
				}
			}

			// Rogue attacks
			if(time % 4 == 0){
				hitpointsMonster -=30;
				System.out.println("The Rogue deals 30 HP damage (primary)!");
				System.out.println("The monster still has "+hitpointsMonster+" HP!");
				if(hitpointsMonster<0){
					System.out.println("Rogue overkill: "+Math.abs(hitpointsMonster));
					System.out.println("Monster died!");
					System.out.println("");
					return 0;
				}
			}

			if(time % 3 == 0){
				hitpointsMonster -=20;
				System.out.println("The Rogue deals 20 HP damage (secondary)!");
				System.out.println("The monster still has "+hitpointsMonster+" HP!");
				if(hitpointsMonster<0){
					System.out.println("Rogue overkill: "+Math.abs(hitpointsMonster));
					System.out.println("Monster died!");
					System.out.println("");
					return 0;
				}
			}

			time++;
		}
	}

}
