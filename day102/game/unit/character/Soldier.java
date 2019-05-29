package game.unit.character;

public class Soldier{
	
	int hp=100, x=0, y=0;
	String name;
	
	Dragon dragon = new Dragon();
	public Soldier(){
		
	}
	public Soldier(int hp, int x, int y, String name) {
		
		this.hp = hp;
		this.x = x;
		this.y = y;
		this.name = name;
		
	}
	
	public void attack() {
		System.out.println("군인이 공격하였습니다.");
		dragon.setHp(dragon.getHp-20);
	}
	public void beAttacked(int temp) {
		
	}
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
