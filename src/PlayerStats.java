
public class PlayerStats {
	private double PlayerCarryWeight = 0;
	private double PlayerCarryLimit = 0;
	private int PlayerMaxHealth = 0;
	private int PlayerCurrentHealth = 0;
	
	public void setPlayerCarryWeight (double newPlayerCarryWeight) {  
		PlayerCarryWeight = newPlayerCarryWeight;
		}
	public void setPlayerCarryLimit (double newPlayerCarryLimit) {  
		PlayerCarryLimit = newPlayerCarryLimit;
		}
	
	public void setPlayerMaxHealth (int newPlayerMaxHealth) {  
		PlayerMaxHealth = newPlayerMaxHealth;
		}
	public void setPlayerCurrentHealth (int newPlayerCurrentHealth) {  
		PlayerCurrentHealth = newPlayerCurrentHealth;
		}
	public void gainItem (double newItemWeight) {  
		PlayerCarryWeight = PlayerCarryWeight + newItemWeight;
		}
	

			
	public double getPlayerCarryWeight() { 
		return PlayerCarryWeight;
		}
	public double getPlayerCarryLimit() { 
		return PlayerCarryLimit;
		}
	public String getPlayerWeightStaus() { 
		String PlayerWeightStatus;
		if (PlayerCarryWeight >= PlayerCarryLimit)
			PlayerWeightStatus = "Overweight";
		else 
			PlayerWeightStatus = "Overencumbered";
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

/*
	private int Vitality = 0;
	private int Strength = 0;
	private int Dexterity = 0;
	private int Intelligence = 0;
	private int Luck = 0;
	
	}
public String Role = "Fighter";
*/
