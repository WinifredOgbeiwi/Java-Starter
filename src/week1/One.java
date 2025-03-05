package week1;

public class One {
    public static void main(String[] args) {
        System.out.println("Hello Vistula");

        //Testing debugging
        // System.out.println(3/0);
       try {
           System.out.println(3/0);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }



}