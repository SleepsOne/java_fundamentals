public class Item   {
    private String name;
    private String type;
    private double price;
    private String size;


    public Item() {

    }

    public Item(String name, String type, double price, String size) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getBasePrice() {
        return 0.0;
    }
    public double getAdjustedPrice() {
        return 0.0;
    }
    public void printItem() {
        System.out.println("-------------");
    }


    //method

}

class Burger extends Item{
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(Item extra1, Item extra2, Item extra3) {
        super("name", "type", 0.0, "size");
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public Burger(String name, String type, double price, String size, Item extra1, Item extra2, Item extra3) {
        super(name, type, price, size);
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public void addToppings() {

    }

}

