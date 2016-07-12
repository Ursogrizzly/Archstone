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
	
	
	
	public static Weapons createWeapon(String ItemName, double ItemWeight, String ItemDescription, double ItemDamage)
	{
		Weapons SituationalItem = new Weapons(ItemName, ItemWeight, ItemDescription, ItemDamage);
		return SituationalItem;
	}
}
