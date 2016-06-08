// It fucking works

class Items {
    enum Type {
        WEAPON, ACCESSORY, KEY, CONSUMABLE
    };

    Type itemType;
    String itemName;
    String itemDescription;
    String itemLongDescription;
    double itemWeight;
		
    public static void main(String[] args) {
        Items [] items = new Items [999];

        items[0] = new Items();
        items[0].itemType = Type.KEY;
        items[0].itemName = "Basement Key";
        items[0].itemDescription = "Opens the church basement door";
        items[0].itemLongDescription = "Opens the church basement door";
        items[0].itemWeight = 0.1;
		
		
		items[1] = new Items();
		items[1].itemType = Type.CONSUMABLE;
		items[1].itemName = "Conner's big fat cock";
		items[1].itemDescription = "A dagger forged by the gods, of which can tear whole assholes apart";
        items[1].itemLongDescription = "Opens the church basement door";
		items[1].itemWeight = 1000.1;
		
		items[2] = new Items();
		items[2].itemType = Type.CONSUMABLE;
		items[2].itemName = "Potion";
		items[2].itemDescription = "A potion that heals 4 health.";
		items[2].itemLongDescription = "Has a small 'Brewed by Bearwyn' label.";
		items[2].itemWeight = 10.0;
		
		items[3] = new Items();
		items[3].itemType = Type.WEAPON;
		items[3].itemName = "A 14 Pound Sword";
		items[3].itemDescription = "A potion that weighs 14 pounds.";
		items[3].itemLongDescription = "Strangely, it has the words 'DIE ANTWOORD' ingraved into its hilt.";
		items[3].itemWeight = 14.0;
		
	    
    }
}