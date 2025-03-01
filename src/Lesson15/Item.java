package Lesson15;

public class Item {
    private String name;
    private int quantity;

    public Item(String name,int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void decreaseQuantity(int amount) throws OutOfStockException{
        if (amount>quantity){
            throw new OutOfStockException(name + "");
        }else {
            quantity -= amount;
        }

    }
}
