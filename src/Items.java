// It fucking works

class Item {
    enum Type {
        ACCESSORY, KEY, CONSUMABLE
    };

    Type itemType;
    String itemName;
    String itemDescription;
    String itemLongDescription;
    double itemWeight;

    public static void main(String[] args) {
        Item [] items = new Item [999];

        items[0] = new Item();
        items[0].itemType = Type.KEY;
        items[0].itemName = "Basement Key";
        items[0].itemDescription = "Opens the church basement door";
        items[0].itemLongDescription = "Opens the church basement door";
        items[0].itemWeight = 0.1;
		
		
		items[1] = new Item();
		items[1].itemType = Type.CONSUMABLE;
		items[1].itemName = "Conner's big fat cock";
		items[1].itemDescription = "A dagger forged by the gods, of which can tear whole assholes apart";
        items[1].itemLongDescription = "Opens the church basement door";
		items[1].itemWeight = 1000.1;
		
		items[2] = new Item();
		items[2].itemType = Type.CONSUMABLE;
		items[2].itemName = "Potion";
		items[2].itemDescription = "A potion that heals 4 health.";
		items[2].itemLongDescription = "Has a small 'Brewed by Bearwyn' label.";
		items[2].itemWeight = 1000.1;
		
    }
}