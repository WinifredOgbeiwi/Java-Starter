import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

public class Main {
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