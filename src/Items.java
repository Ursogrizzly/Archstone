public class Items {
	//setting stuff up, need to fix to be able to import playerStats
	String[] Type = {Accessory, Key, Consumable};
	String Name;
	String Description;
	String Weight;
	
	/* Not sure if there's a better way, but by going this route
	   every item would be it's own object. Not sure if this is effective
	   but this is what I can come up with being only 5 chapters deep into 
	   Headfirst
	*/
	
	Item Dildo = new Dildo();
	.Type = Key;
	.Name = Dildo;
	.Description = "A dildo is a sex toy, often explicitly phallic in appearance, intended for sexual penetration or other sexual activity during masturbation or with sex partners.";
	.Weight = 10;
	
}
