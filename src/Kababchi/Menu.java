package Kababchi;

public class Menu {
    Kabab kabab;
    Meze meze;
    Ichki ichki;
    public Menu (Kabab kabab, Meze meze, Ichki ichki){
        this.kabab = kabab;
        this.meze = meze;
        this.ichki = ichki;
    }
    public double calculateTotalPrice(){
        return kabab.getPrince() + meze.getPrice() + ichki.getPrice();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "kabab=" + kabab.name + " " + kabab.price + "AZN" +
                ",meze=" + meze.name + " " + meze.price + "AZN" +
                ",ichki=" + ichki.name + " " + ichki.price + "AZN" + " " +
                "Total Price: AZN" + calculateTotalPrice();
    }
}
