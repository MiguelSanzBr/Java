package gd;
import java.util.Scanner;

public class calculaTrapezio {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da base maior: ");
        
        double baseMr = input.nextDouble();

        System.out.print("Digite o valor da base menor: ");
        
        double baseMn = input.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double altura = input.nextDouble();

        double area = ((baseMr + baseMn) * altura) / 2;
        if (Double.isNaN(area))
       {
       System.out.println("Área inválida");
       }
        else if (area > 10)
         {
        System.out.println("Area Grande");
         }
      
       else if(area >= 5 && area <= 10 )
      {
        System.out.println("Area Media");
      }
      
          else if (area < 5 )
          {
           System.out.println("Area Pequena");
          }
      }
  }
      