package Kababchi;

public class Main {
    public static void main(String[] args) {

        Kabab kabab = new Kabab("Kabab" ,12.00);
        Meze meze = new Meze("Meze" ,5.50);
        Ichki ichki = new Ichki("Ichki" ,2.90);
        Menu menu = new Menu(kabab, meze, ichki);
        System.out.println(menu.toString());
    }
}
