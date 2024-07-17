import java.util.Arrays;

public class ShoppingList {
        Item[] items;
        int itemCount;

        public double calculateTotalCost() {
            double totalCost = 0;
            for (int i = 0; i < itemCount; i++) {
                totalCost += items[i].getPrice();
            }
            return totalCost;
        }

        public void addItem(Item newItem) {
            if (itemCount < items.length) {
                items[itemCount] = newItem;
                itemCount++;
            }
        }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "items=" + Arrays.toString(items) +
                ", itemCount=" + itemCount +
                '}';
    }
}


