import java.util.Scanner;
public class SumaDeDosNumeros_1 {
      public static void main(String [] args){
            Scanner leer = new Scanner(System.in);
          
          System.out.print("ENTER FIRST NUMBER: ");
          var a = leer.nextInt();
          System.out.print("ENTER SECOND NUMBER: ");
          var b = leer.nextInt();
          
          var c = a + b;
          
          System.out.printf("YHE SUM %d + %d = %d", a, b, c);
          
           
      }
    
}
