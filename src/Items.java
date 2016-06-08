// It fucking works

class Item {
    enum Type {
        ACCESSORY, KEY, CONSUMABLE
    };

    Type type;
    String name;
    String description;
    double weight;

    public static void main(String[] args) {
        Item [] items = new Item [999];

        items[0] = new Item();
        items[0].type = Type.KEY;
        items[0].name = "Basement Key";
        items[0].description = "Opens the church basement door";
        items[0].weight = 0.1;
		
		
		items[1] = new Item();
		items[1].type = Type.CONSUMABLE;
		items[1].name = "Conner's big fat penis";
		items[1].description = "A dagger forged by the gods, of which can tear whole assholes apart";
		items[1].weight = 1000.1;
		
    }
}