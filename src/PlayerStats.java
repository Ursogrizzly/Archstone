public class PlayerStats {
	private double PlayerCarryWeight = 0; //setting variables
	private double PlayerCarryLimit = 0;
	private double ItemWeight = 0;
	private int PlayerMaxHealth = 0;
	private int PlayerCurrentHealth = 0;
	
	public void setPlayerCarryWeight (double newPlayerCarryWeight) {  //void because it doesnt return anything
		PlayerCarryWeight = newPlayerCarryWeight; // might need fix
		}
	public void setPlayerCarryLimit (double newPlayerCarryLimit) {  
		PlayerCarryLimit = newPlayerCarryLimit;
		}
	public void SetItemWeight (double newItemWeight) {
		PlayerCarryLimit = newPlayerCarryLimit;
		}
	
	public void setPlayerMaxHealth (int newPlayerMaxHealth) {  
		PlayerMaxHealth = newPlayerMaxHealth;
		}
	public void setPlayerCurrentHealth (int newPlayerCurrentHealth) {  
		PlayerCurrentHealth = newPlayerCurrentHealth;
		}
	public void gainItem (double ItemWeight) {  //gains an item, and adds Player current Carry Weight and adds itemweight
		PlayerCarryWeight = PlayerCarryWeight + ItemWeight;
		}
	

			
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
