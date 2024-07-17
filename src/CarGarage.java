public class CarGarage {
    public static void main(String[] args) {
        String[][] garage = new String[3][3];

        garage[0][0] = "Mercedes";
        garage[0][1] = "E-Class";

        garage[1][0] = "BMW";
        garage[1][1] = "X9";

        garage[3][0] = "Audi";
        garage[3][1] = "Q8";

        System.out.println("3 avtomobil qaraja daxil oldu!");
        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < garage[i].length; j++) {
                System.out.print(garage[i][j] + " ");
            }
            System.out.println();
            System.out.println("Parking: " + (i+1) + garage[i][0] + garage[i][1]);
        }
    }
}
