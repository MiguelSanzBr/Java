package gd;
import java.util.Scanner;

public class calculoDoReservatorio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       //entrada
       
        System.out.print("Digite a largura do reservatório: ");
        double largura = input.nextDouble();

        System.out.print("Digite a altura do reservatório: ");
        
        double altura = input.nextDouble();

        System.out.print("Digite o comprimento do reservatório em Centimetros: ");
        
        double comprimento = input.nextDouble();
 
       System.out.print("Digite os Dias para Calculo dos Consumo: ");
        
        double dias = input.nextDouble();
      
        System.out.print("Digite os litros para Calculo dos Consumo: ");
        
        double litros = input.nextDouble();
        
        //Processamento
        
        double capacidade = (largura * altura * comprimento)/1000;
        
        double consumoM = (litros/dias);
        
        double autonomia = (capacidade/consumoM);
       
        //saida
        if (autonomia > 7 ) 
        {
      System.out.println("Consumo Reduzido");
        }
        else if ( autonomia >= 2 && autonomia <= 7)
        {
        System.out.println("Consumo Moderado");
        }
        else if ( autonomia < 2 ) 
        {
        System.out.println("Consumo Elevado");
        }
    }
}