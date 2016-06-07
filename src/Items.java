public class Items {
	
	String[] Type = {"Accessory", "Key", "Consumable"};
	String Name;
	String Description;
	String Weight;
	
	Items [] I = new Item [999];
	
	// There has to be a better way to do this (Btw it's bugged as hell for some reason, I just can't get it to compile)
	I[1] = new Item();
	I[1].Type = "Key";
	I[1].Name = "Basement Key";
	I[1].Description = "Opens the church basement door";
	I[1].Weight = "1";
	
	
}
