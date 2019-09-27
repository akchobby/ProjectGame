// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ProjectGameVer3;


/************************************************************/
/**
 * Orc is a special monster that can double its attack power on knocking out an opponent 
 * and get healed.
 * 
 */
public class Orc extends Monster {
	
	/**
	 * Default parameters of Orc.
	 */
	public Orc() {
		super();
		this.name = "Orc";
		this.attackPower= 25;
		this.maxHP= 85;
		this.hp = this.maxHP;
	}

	/**
	 * This initializes an Orc with   name , Attack Power and max health points.
	 * @param attackPower
	 * @param name
	 * @param maxHP
	 */
	public Orc(int attackPower, String name, int maxHP) {
		super(attackPower, name, maxHP);
		this.name += " the Orc";
	}

	/**
	 * This initializes an Orc with name and default parameters. 
	 * @param name
	 */
	public Orc(String name) {
		super(name);
		this.name += " the Orc";
		this.attackPower= 25;
		this.maxHP= 85;
		this.hp = this.maxHP;
	}
	@Override
	/**
	 * This function is redefined as the Orc on knocking out a hero will get healed and its attack 
	 * power doubles.
	 * @param opponent 
	 */
	public void attack(Role opponent) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		this.checkPoison();
		opponent.getAttacked(this);
		if(opponent.getHp()<=0) {
			this.setAttackPower(2*this.attackPower);
			this.hp = this.maxHP;
			System.out.println(this.name+" activates Orc boost on killing "+opponent.name+"\nAttack power doubles and its healed.");
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
};