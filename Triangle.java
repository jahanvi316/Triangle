public class Triangle{
   private int side1;
   private int side2;
   private int side3;
   
   public Triangle(int side1, int side2, int side3){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }
   
   public int getSide1(){
      return side1;
   }
   public int getSide2(){
      return side2;
   }
   public int getSide3(){
      return side3;
   }
   
   public boolean isEquilateral(){
      return (side1 == side2) && (side2 == side3);
   }
   
   public boolean isIsoceles(){
      if (!(isEquilateral())){
         return (side1 == side2) || (side2 == side3);
      }
      else{
         return false;
      }
   }
   
   public boolean isScalene(){
      return (!(isEquilateral())) && (!(isIsoceles()));
   }
   
   public String toString(){
      return "{side1: " + side1 + ", side2: " + side2 + ", side3: " + side3 + "}";
   }
}