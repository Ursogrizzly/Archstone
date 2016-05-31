
public class PlayerStats {
	private double PlayerCarryWeight = 0;
	private double PlayerCarryLimit = 0;
	
	public void setPlayerCarryWeight (double newPlayerCarryWeight) {  
		PlayerCarryWeight = newPlayerCarryWeight;
		}
	public void setPlayerCarryLimit (double newPlayerCarryLimit) {  
		PlayerCarryLimit = newPlayerCarryLimit;
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
}

/*
	private int PlayerHealth = 0;
	private int PlayerMana = 0;
	private int PlayerStamina = 0;

	private int Vitality = 0;
	private int Strength = 0;
	private int Dexterity = 0;
	private int Intelligence = 0;
	private int Luck = 0;
	
	}
public String Role = "Fighter";
*/
