public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;


    public MealOrder() {
        this("regular", "coke","fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item("DRINK", drinkType, 1.0);
        this.side = new Item("SIDE", sideType, 1.5);
    }

    public double getTotalPrice(){
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }


    public void setDrinkSize(String sz){
        drink.setSize(sz);
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }







}
