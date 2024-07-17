package CharacterGame;

public class Warrior extends Character {
    int strength;

    public Warrior(String name, int strength) {
        super(name);
        this.strength = strength;
    }
    public void attack(){
        System.out.println(name + "is attacking with strength"+strength);
    }
    public void useSpecialAbility(){
        System.out.println("");
    }
}
