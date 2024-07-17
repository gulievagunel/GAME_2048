package CharacterGame;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Gorak",15);
        Mage mage = new Mage("Elara",15);
        System.out.println("Warrior actions:");
        warrior.attack();
        warrior.useSpecialAbility();
        System.out.println("Mage actions:");
        mage.attack();
        mage.useSpecialAbility();
    }
}
