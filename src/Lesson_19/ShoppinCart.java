package Lesson_19;

import java.util.HashMap;
import java.util.Map;

public class ShoppinCart {
    private Map<String, Double> itemPrices;
    public ShoppinCart(){
        itemPrices = new HashMap<>();
    }
    public void addItem(String itemName, double itemPrice){
        itemPrices.put(itemName,itemPrice);
    }
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (double price: itemPrices.values()){
            totalPrice += price;
        }
        return totalPrice;
    }
}
