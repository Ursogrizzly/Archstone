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
	public static Weapons Sword =  new Weapons("Sword", 14, "bent and rusty", 12); //itemName, itemDescription, itemWeight
	public static Weapons Spear =  new Weapons("Spear", 30, "smelly",  12);
	
	
	
	public static Weapons createWeapon(String SituationalItemName, double SituationalItemWeight, String SituationalItemDescription, double SituationalItemDamage)
	{
		
		Weapons SituationalItem = new Weapons(SituationalItemName, SituationalItemWeight, SituationalItemDescription, SituationalItemDamage);
		return SituationalItem;
	}
}
