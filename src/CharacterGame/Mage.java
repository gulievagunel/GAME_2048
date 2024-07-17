package CharacterGame;

public class Mage extends Character {
    int intellect;

    public Mage(String name, int intellect) {
        super(name);
        this.intellect = intellect;
    }
    public void attack(){
        System.out.println(name +"is attacking with intellect"+intellect);
    }
    public void useSpecialAbility(){
        System.out.println("");
    }
}
