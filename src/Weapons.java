class Weapons{
	public String itemName;
	public  String itemDescription;
	public  double weight;
	
	public Weapons(String mitemName,String mitemDescription,int mweight)
	{
	    this.itemName=mitemName;
	    this.itemDescription=mitemDescription;
	    this.weight=mweight;
	}	
	public static Weapons Sword =  new Weapons("Sword", "bent and rusty", 14);
	public static Weapons Spear =  new Weapons("Spear", "smells", 30);

}
