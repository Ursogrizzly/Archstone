
public class NonPlayerCharacters {
	public static String nonPlayerCharacterName;
	public static int nonPlayerCharacterAttack;
	public static Weapons nonPlayerCharacterWeapon;
	public static int nonPlayerCharacterHealth;
	public static String nonPlayerCharacterDescription;
//basic type of NPC, with name, health, desc, attack, and weapon
	public NonPlayerCharacters(String nonPlayerCharacterName, int nonPlayerCharacterHealth, 
			String nonPlayerCharacterDescription, int nonPlayerCharacterAttack, Weapons nonPlayerCharacterWeapon){
		this.nonPlayerCharacterName = nonPlayerCharacterName;
		this.nonPlayerCharacterHealth = nonPlayerCharacterHealth;
		this.nonPlayerCharacterDescription = nonPlayerCharacterDescription;

		this.nonPlayerCharacterAttack = nonPlayerCharacterAttack;
		this.setNonPlayerCharacterWeapon(nonPlayerCharacterWeapon);
	}
	
	//types of monsters
	public static NonPlayerCharacters MonstersSpearTroll = new NonPlayerCharacters
			("Troll", 160, "troll with a spear", 13, Weapons.Spear); // stringname, health, desc, attack, weapon
	public static NonPlayerCharacters MonstersSwordOrc = new NonPlayerCharacters
		("Orc", 50, "orc with a sword", 13, Weapons.Sword); //

	//getters for all these details
		public String getnonPlayerCharacterName() {
			return this.nonPlayerCharacterName;
		}
		
		public int getnonPlayerCharacterHealth() {
			return this.nonPlayerCharacterHealth;
		}
		
		public String getnonPlayerCharacterDescription() {
			return this.nonPlayerCharacterDescription;
		}
		
		public int getnonPlayerCharacterAttack() {
			return this.nonPlayerCharacterAttack;
		}
		
		public Weapons getNonPlayerCharacterWeapon() {
			return this.nonPlayerCharacterWeapon;
		}
		

		public void setNonPlayerCharacterWeapon(Weapons nonPlayerCharacterWeapon) {
			this.nonPlayerCharacterWeapon = nonPlayerCharacterWeapon;
		}

	//setters
		public void setNonPlayerCharacterHealth(int NPChealthchange) {// in negatives
			nonPlayerCharacterHealth = nonPlayerCharacterHealth + NPChealthchange;
		}
}
