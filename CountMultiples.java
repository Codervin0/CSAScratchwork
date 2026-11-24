public class CountMultiples {

   public static int countMultiples(int largestSum, int numMult) {
      int output = 0;
      int factor = numMult;
      while (factor <= largestSum){
         factor += numMult;
         output++;
      }
   return output;
   }
   
   public static void main(String[] args) {
      System.out.println(countMultiples(5,10));
   }
}