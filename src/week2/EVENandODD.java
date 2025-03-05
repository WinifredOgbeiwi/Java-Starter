package week2;

public class EVENandODD {
    public static void main(String[] args) {

      int randomNum = (int) (Math.random() * 100) + 1;
      System.out.println(randomNum);

      if(randomNum % 2 == 0) System.out.println("It is even ");
      else System.out.println("It is odd");
    }
}
