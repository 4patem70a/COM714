public class LifeEntity {
      
      //attributes
      private String name;
      private int age;
      private double weight;
      private double hight;
      private int energy;

      //constructor
      public LifeEntity(String nameIn, int ageIn, double weightIn, double heightIn) {
          name = nameIn;
          age = ageIn;
          weight = weightIn;
          height = heightIn;
          energy = 100;

      }

      //behaviour
      public String getname(){
          return name;
        
      }

       public int getage(){
        return age;
      }
       
       public double getweight(){
           return weight;
       }
        
        public double gethieght(){
            return height;
        }
         
         public int getenergy() {
             return energy;
         }

         public void setname(string name){

         }
          public void setAge(int age){
              this.age = age;
          }
           public void setWieght(doublr weight){
               this.weight = weight;
           }
           public void setHieght(double height){
               this.height = height;
           }

           public void setEnergy(int energy){
               this.energy = energy;
           }
            
            public void speak(){
                System.out.printIn("not sure what sound it make");
            }
            public void mate(){
                System.out.printIn("not sure who to mate with");
}