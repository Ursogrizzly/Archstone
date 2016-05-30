
public class PlayerStats {
	private double PlayerCarryWeight = 0;
	private double PlayerCarryLimit = 0;
	
	public void setPlayerCarryLimit (double newPlayerCarryLimit) {  
		PlayerCarryLimit = newPlayerCarryLimit;
		}
	public void setPlayerCarryWeight (double newPlayerCarryWeight) {  
		PlayerCarryWeight = newPlayerCarryWeight;
		}
public String toString() {
	String returnedValue;
	returnedValue = "Current Player Carry Weight: " + PlayerCarryWeight + "/" + PlayerCarryLimit;
	return returnedValue;
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
