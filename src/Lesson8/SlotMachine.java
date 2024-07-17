package Lesson8;

public class SlotMachine {
   static String [] Symbols = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
   public void pullLever(){
       String symbols1 = Symbols[(int) (Math.random()* Symbols.length)];
       String symbols2 = Symbols[(int) (Math.random()* Symbols.length)];
       String symbols3 = Symbols[(int) (Math.random()* Symbols.length)];
       System.out.println("Lever result: " + symbols1 + " " + symbols2 + " " + symbols3 );
       if (symbols1.equals(symbols2) && symbols2.equals(symbols3)){
           System.out.println("Congratulations you won!");
       } else {
           System.out.println("You lost. Try again." );
       }
   }
}
