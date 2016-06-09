// It fucking works

class Items {
    enum Type {
        WEAPON, ACCESSORY, KEY, CONSUMABLE
    }

    Type itemType;
    String itemName;
    String itemDescription;
    String itemLongDescription;
    double itemWeight;

		public static void main (String[] args) { 
		Items [] itemList = new Items [999];{
       
        itemList[0] = new Items();
        itemList[0].itemType = Type.KEY;
        itemList[0].itemName = "Basement Key";
        itemList[0].itemDescription = "Opens the church basement door";
        itemList[0].itemLongDescription = "Opens the church basement door";
        itemList[0].itemWeight = 0.1;

        itemList[2] = new Items();
        itemList[2].itemType = Type.CONSUMABLE;
        itemList[2].itemName = "Potion";
        itemList[2].itemDescription = "A potion that heals 4 health.";
        itemList[2].itemLongDescription = "Has a small 'Brewed by Bearwyn' label.";
        itemList[2].itemWeight = 10.0;
		
        itemList[3] = new Items();
        itemList[3].itemType = Type.WEAPON;
        itemList[3].itemName = "A 14 Pound Sword";
        itemList[3].itemDescription = "A potion that weighs 14 pounds.";
        itemList[3].itemLongDescription = "Strangely, it has the words 'DIE ANTWOORD' ingraved into its hilt.";
        itemList[3].itemWeight = 14.0;
       
        
		System.out.println(itemList[0].itemName);
		
		
		}
	}
}
