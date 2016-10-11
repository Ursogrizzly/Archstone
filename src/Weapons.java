import java.util.Arrays;
import java.util.Random;
class Weapons{
	public String itemName;
	public  String itemDescription;
	public  double itemWeight;
	public double itemDamage;
	
	public Weapons(String mitemName, double mitemweight, String mitemDescription, double mitemdamage)
	{
	    this.itemName=mitemName;
	    this.itemDescription=mitemDescription;
	    this.itemWeight=mitemweight;
	    this.itemDamage= mitemdamage;
	}	
	Random random = new Random();
	public static Weapons Sword =  new Weapons("Sword", 14, "bent and rusty", 6); //itemName, itemDescription, itemWeight
	public static Weapons Spear =  new Weapons("Spear", 15, "smelly",  8);
	public static Weapons Ulfbert = new Weapons("Ulfbert", 30, "god-like", 12);
	
	
	
	public static Weapons createWeapon(String SituationalItemName, double SituationalItemWeight, String SituationalItemDescription, double SituationalItemDamage)
	{ // does not work currently, not important
		
		Weapons SituationalItem = new Weapons(SituationalItemName, SituationalItemWeight, SituationalItemDescription, SituationalItemDamage);
		return SituationalItem;
	}
	
	@Override
    public String toString(){
        return this.itemName +", damage:" + this.itemDamage + ",";
    }
}

