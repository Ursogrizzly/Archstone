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
	
    }
}