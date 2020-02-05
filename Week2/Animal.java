public class Animal {

    //attributes
   private int energy;

   // constructor
   public Animal() {
       energy = 10;
   }

   //behaviours
   public void eat(int amount ) {
        energy = energy + amount;
   }
   public void speak(){
       System.out.println("ahh");
   }
}