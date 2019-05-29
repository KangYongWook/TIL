package game.unit.character;

import java.util.Scanner;

public class Healer {
	
	int hp=100,x=0,y=0;
	String name ;
	Scanner sc = new Scanner(System.in);
	
	Soldier soldier = new Soldier();
	Wizard wizard = new Wizard();
	
	public Healer() {
		
	}
	
	public Healer(int hp, int x, int y, String name) {
		this.hp = hp;
		this.x = x;
		this.y = y;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void heal() {
		System.out.println("힐을 해줄 유닛을 고르시오. 1.군인 2. 마법사 3.힐러");
		int indata = sc.nextInt();
		if( equals( soldier.getName()) && indata == 1   ) {
			soldier.setHp(soldier.getHp() + 10); 
		}
		if(	equals( Wizard.getName()) && indata == 2 ) {
			wizard.setHp(wizard.getHp() + 10); 
		}
		if(equals( Healer.getName()) && indata == 3 ) {
			this.hp+=10; 
		}
		
	}

}
