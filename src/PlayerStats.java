public class PlayerStats {
//	private int PlayerVita = 0;
//	private int PlayerStr = 0;
//	private int PlayerDex = 0;
//	private int PlayerInt = 0;
//	private int PlayerLuck = 0;

	private double PlayerCarryWeight = 0; //setting variables
	private double PlayerCarryLimit = 0;
	public double ItemWeight = 0;
	private int PlayerMaxHealth = 0;
	private int PlayerCurrentHealth = 0;

//must create a set and get for EACH STAT. maybe don't include that many stats.

	
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
	public String getPlayerWeightStaus() { //determines if player is under or over weight and returns it
		String PlayerWeightStatus;
		if (PlayerCarryWeight >= PlayerCarryLimit)
			PlayerWeightStatus = "Overweight";
		else 
			PlayerWeightStatus = "Underweight";
		return PlayerWeightStatus;
		}
/*
* SET ITEM WEIGHT, gainItem
 */	
	public void SetItemWeight (double newItemWeight) {
		ItemWeight = newItemWeight;
		}

	public void gainItem (double test) {  //gains an item, and adds Player current Carry Weight and adds itemweight
		PlayerCarryWeight = PlayerCarryWeight + test;
		}
	
/*
* SET HEALTH set Max, set current
*/
	public void setPlayerMaxHealth (int newPlayerMaxHealth) {  
		PlayerMaxHealth = newPlayerMaxHealth;
		}
	public void setPlayerCurrentHealth (int newPlayerCurrentHealth) {  
		PlayerCurrentHealth = newPlayerCurrentHealth;
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

