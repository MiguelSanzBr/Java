package gd;

import java.util.Scanner;

public class loop10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabela de conversão de Celsius para Fahrenheit:");
        System.out.println("Celsius\tFahrenheit");
        for (int celsius = 0; celsius <= 100; celsius++) {
            double fahrenheit = celsius * 1.8 + 32;
            System.out.printf("%d\t%.1f\n", celsius, fahrenheit);
        }
    }
}