import java.util.ArrayList;
public class PlayerStats {

	private ArrayList<Weapons> inventory; //Instantiate an arraylist of items to hold inventory
	private double PlayerCarryWeight = 0; //setting variables
	private double PlayerCarryLimit = 0;
	private int PlayerMaxHealth = 0;
	private int PlayerCurrentHealth = 0;
	
	public PlayerStats(int wt, int maxH) {
		//Add more parameters to this when you need to make more attributes such as
		//current equipped weapon, class type, mana, etc.
		this.inventory = new ArrayList<Weapons>();
		this.PlayerCarryLimit = wt;
		this.PlayerMaxHealth = maxH;
		
		//Initialize current variables
		PlayerCarryWeight = 0;
		PlayerCurrentHealth = PlayerMaxHealth;		
	}
	
/*
* SET WEIGHT player carry WEIGHT, set player carry limit,
*/	
	public void setPlayerCarryWeight (double newPlayerCarryWeight) {  //void because it doesnt return anything
		PlayerCarryWeight = newPlayerCarryWeight; // might need fix
		}
	public void setPlayerCarryLimit (double newPlayerCarryLimit) {  
		PlayerCarryLimit = newPlayerCarryLimit;
		}

/*
* GET WEIGHT current player carry weight, get player carry limit, get player weight status as a String "Underweight"
*/
			
	public double getPlayerCarryWeight() { //gets player carry weight and returns it to GameTest
		return PlayerCarryWeight;
		}
	public double getPlayerCarryLimit() { //gets player carry limit and returns it to GameTest
		return PlayerCarryLimit;
		}
	public String getPlayerWeightStatus() { //determines if player is under or over weight and returns it
		String PlayerWeightStatus;
		if (PlayerCarryWeight >= PlayerCarryLimit)
			PlayerWeightStatus = "Overweight";
		else 
			PlayerWeightStatus = "Underweight";
		return PlayerWeightStatus;
		}
	public String getPlayerWeightStatusExact(){
		return (PlayerCarryWeight + "/" + PlayerCarryLimit);
		}	
/*
*  gainItemSituational, addItem
 */	

	public void gainItemSituational (double test) {  //gains an item, and adds Player current Carry Weight and adds itemweight
		PlayerCarryWeight = PlayerCarryWeight + test;
		}
	/**
	 * Add an item to the player's inventory
	 * @param Item
	 */
	public String addItem(Weapons Item) {
		if (Item.weight + this.PlayerCarryWeight > this.PlayerCarryLimit) { //Inventory is full, alternatively you can
			//make the player over encumbered
			return ("Inventory is full.  You cannot pick up this item!");
			}
		else{
			
			inventory.add(Item); //Add item to the inventory
			this.PlayerCarryWeight += Item.weight; //Add the items weight to current weight
			return ("You picked up "+Item.itemName);
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
		inventory.remove(Item);
		PlayerCarryWeight = PlayerCarryWeight - Weapons.Sword.weight;
		
		//drop the item on the ground in the controller (could return the item removed to game)
		}

	
/*
* SET HEALTH set Max, set current
*/
	public void setPlayerMaxHealth (int newPlayerMaxHealth) {  
		this.PlayerMaxHealth = newPlayerMaxHealth;
		}
	public void setPlayerCurrentHealth (int newPlayerCurrentHealth) {  
		this.PlayerCurrentHealth = newPlayerCurrentHealth;
		}
/*
* GET HEALTH Get Max, get current, and get health status as percentage
*/
	public int getPlayerMaxHealth() { 
		return PlayerMaxHealth;
		}
	public int getPlayerCurrentHealth() { 
		return PlayerCurrentHealth;
		}
	public double getPlayerHealthStatus() { 
		double PlayerHealthStatus;
		PlayerHealthStatus = (PlayerCurrentHealth/PlayerMaxHealth)*100;
		return PlayerHealthStatus;
		}
	
}

