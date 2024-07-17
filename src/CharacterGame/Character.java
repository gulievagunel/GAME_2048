package CharacterGame;

public class Character {
    String name;

    public Character(String name) {
        this.name = name;
    }
    public void attack(){
        System.out.println(name+"is attacking.");
    }
    public void useSpecialAbility(){
        System.out.println(name+"is using a special ability");
    }
}
