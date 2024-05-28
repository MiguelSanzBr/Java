package gd;
import java.util.Scanner;

public class NumeroPorZeroECem {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite o valor do Seu Rendimento Escolar em Porcentagem: ");
			    
			    double numero = input.nextDouble();
			       if (numero < 0 || numero > 100 || numero % 1 != 0) 
			        {
			            System.out.println("porcentagem inválida. Tente novamente.");
			        }
			     
			       else if ( numero <= 100 && numero >= 90 )
			    {
			    System.out.println("Sua porcentagem De Acerto Escolar foi de : " + numero + " % , Portando sua Nota é : MB");
			    }
			    else if ( numero <= 89 && numero >= 70 )
			    {
			    System.out.println("Sua porcentagem De Acerto Escolar foi de : " + numero + " % , Portando sua Nota é : B");
			    }
			  else if ( numero <= 69 && numero >= 50 )
			    {
			    System.out.println("Sua porcentagem De Acerto Escolar foi de : " + numero + " % , Portando sua Nota é : R");
			    }
			   else
			    {
			    System.out.println("Sua porcentagem De Acerto Escolar foi de : " + numero + " % , Portando sua Nota é : I");
			    }
		}
            
        }
    }