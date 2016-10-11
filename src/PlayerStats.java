import java.util.ArrayList;
import java.util.Arrays;
public class PlayerStats {

	ArrayList<Weapons> inventory; //Instantiate an arraylist of items to hold inventory
	private double PlayerCarryWeight = 0; //setting variables
	private double PlayerCarryLimit = 0;
	private int PlayerMaxHealth = 0;
	private int PlayerCurrentHealth = 0;
	private Weapons PlayerEquipedWeapon;
	private boolean aliveStatus = true;
	
	public PlayerStats(int wt, int maxH) {
		//Add more parameters to this when you need to make more attributes such as
		//current equipped weapon, class type, mana, etc.
		this.inventory = new ArrayList<Weapons>();
		this.PlayerCarryLimit = wt;
		this.PlayerMaxHealth = maxH;
		//this.PlayerEquipedWeapon = Weapons.Object;
		
		//Initialize current variables
		this.PlayerCarryWeight = 0;
		this.PlayerCurrentHealth = PlayerMaxHealth;	
		this.aliveStatus = aliveStatus;
	}
	
/* 
 * PRINT OUT INVENTORY?
 */
	

/*
* SET WEIGHT player carry WEIGHT, set player carry limit,
*/	
	public void setPlayerCarryWeight (double newPlayerCarryWeight) {  //void because it doesnt return anything
		this.PlayerCarryWeight = newPlayerCarryWeight; // might need fix
		}
	public void setPlayerCarryLimit (double newPlayerCarryLimit) {  
		this.PlayerCarryLimit = newPlayerCarryLimit;
		}

/*
* GET WEIGHT current player carry weight, get player carry limit, get player weight status as a String "Underweight"
*/
			
	public double getPlayerCarryWeight() { //gets player carry weight and returns it to GameTest
		return this.PlayerCarryWeight;
		}
	public double getPlayerCarryLimit() { //gets player carry limit and returns it to GameTest
		return this.PlayerCarryLimit;
		}
	public String getPlayerWeightStatus() { //determines if player is under or over weight and returns it
		String PlayerWeightStatus;
		if (this.PlayerCarryWeight >= this.PlayerCarryLimit)
			PlayerWeightStatus = "Overweight";
		else 
			PlayerWeightStatus = "Underweight";
		return PlayerWeightStatus;
		}
	public String getPlayerWeightStatusExact(){
		return (PlayerCarryWeight + "/" + PlayerCarryLimit);
		}	
/*
*  addItemSituational, addItem
 */	

	/**
	 * Add an item to the player's inventory
	 * @param Item
	 */
	public String addItem(Weapons Item) {
		if (Item.itemWeight + this.PlayerCarryWeight > this.PlayerCarryLimit) { //Inventory is full, alternatively you can
			//make the player over encumbered
			return ("Inventory is full.  You cannot pick up this item!");
			}
		else{
			
			inventory.add(Item); //Add item to the inventory
			this.PlayerCarryWeight += Item.itemWeight; //Add the items weight to current weight
			return ("You picked up "+ Item.itemName);
			}
		}
	
	public String addItemSituational(String situationalItemName, double situationalItemWeight, String situationalItemDescription, double situationalItemDamage) {
		if (situationalItemWeight + this.PlayerCarryWeight > this.PlayerCarryLimit) { //Inventory is full, alternatively you can
			//make the player over encumbered
			return ("Inventory is full.  You cannot pick up this item!");
			}
		else{
			inventory.add(Weapons.createWeapon(situationalItemName, situationalItemWeight, situationalItemDescription, situationalItemDamage)); //Add item to the inventory
			this.PlayerCarryWeight += situationalItemWeight; //Add the items weight to current weight
			return ("You picked up "+ situationalItemName);
			}
		}
	/**
	 * "Drop" an Item from the inventory
	 * Currently this only removes an item permanently
	 * In the future, the controller for the game would have to know all items that are in a room if
	 * You want to have items dropped and re-pick-up-able
	 * @param Item
	 */
	public void removeItem(Weapons Item) {
		this.inventory.remove(Item);
		this.PlayerCarryWeight = this.PlayerCarryWeight - Item.itemWeight;
		
		//drop the item on the ground in the controller (could return the item removed to game)
		}

	
/*
* SET HEALTH set Max, set current, set modified health
*/
	public void setPlayerMaxHealth (int newPlayerMaxHealth) {  
		this.PlayerMaxHealth = newPlayerMaxHealth;
		}
	public void setPlayerCurrentHealth (int newPlayerCurrentHealth) {  
		this.PlayerCurrentHealth = newPlayerCurrentHealth;
		}
	public void setPlayerModHealth (int newPlayerModHealth) {
		this.PlayerCurrentHealth = this.PlayerCurrentHealth + newPlayerModHealth;
	}
/*
* GET HEALTH Get Max, get current, and get health status as percentage
*/
	public int getPlayerMaxHealth() { 
		return this.PlayerMaxHealth;
		}
	public int getPlayerCurrentHealth() { 
		return this.PlayerCurrentHealth;
		}
	public double getPlayerHealthStatus() { 
		double PlayerHealthStatus;
		PlayerHealthStatus = ((double)this.PlayerCurrentHealth/(this.PlayerMaxHealth)*100.00);
		return PlayerHealthStatus;
		}
	public void setAliveStatus(boolean newAliveStatus){
		this.aliveStatus = newAliveStatus;
	}
	
	public boolean getAliveStatus(){
		if (PlayerCurrentHealth > 0) {
			aliveStatus = true;
			return aliveStatus;
		}
		else {
			aliveStatus = false;
			return aliveStatus;
		}
	}
	
}

