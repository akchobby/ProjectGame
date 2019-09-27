// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ProjectGameVer3;

/************************************************************/
/**
 * 
 */
public class Monster extends Role {
	
	/**
	 * 
	 */
	public Monster() {
		super();
		this.name = "Monster";
	}

	/**
	 * @param attackPower
	 * @param name
	 * @param maxHP
	 */
	public Monster(int attackPower, String name, int maxHP) {
		super(attackPower, name, maxHP);
	}

	/**
	 * @param name
	 */
	public Monster(String name) {
		super(name);
	}

	/**
	 * This is a simple function of attack where the poison is checked and the opponent gets attacked.
	 * @param opponent 
	 */
	public void attack(Role opponent) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		this.checkPoison();
		opponent.getAttacked(this);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	/**
	 * Though getAttacked is nearly the same function in monsters compared to Role class, to change the strings that are displayed,
	 * the the method has been redefined.
	 */
	@Override
	public void getAttacked(Role opponent) {
		this.dodge = false;
		double r = Math.random();
		if( r >= this.dodgeChance) {
			this.hp = this.hp - opponent.attackPower;
			System.out.println(opponent.name+ " attacks "+ this.name+" by:"+opponent.attackPower+" HP");
			if (this.hp <=0) {
				this.hp = 0;
				System.out.println(this.name+" is annihilated");
			}
		}else {
			System.out.println(opponent.name+ " tries to attack "+ this.name);
			System.out.println("but it's warded off by "+ this.name);
			this.dodge = true;
		}
	}
	
	@Override
	public String toString(){
		if(this.hp<=0) {
			return String.format("| "+this.name+ " is dead"+" |");
		}
		else {
			return String.format("| "+this.name+"\t  -- "+this.hp+"/"+this.maxHP+" HP |");
		}
	}
};