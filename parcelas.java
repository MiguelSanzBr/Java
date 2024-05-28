package gd;

import java.util.Scanner;

public class parcelas {
				public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do carro: R$ ");
        double valorCarro = input.nextDouble();
        System.out.println("Tabela de Parcelamento:");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Parcelas\tPreço Final\tValor da Parcela");
        System.out.println("--------------------------------------------------------------------");

        double precoAVista = valorCarro * 0.8;
        exibirLinhaTabela(1, precoAVista, precoAVista);

        for (int parcelas = 6; parcelas <= 60; parcelas += 6) {
            double acrescimo = (parcelas - 6) * 0.03; 
            double precoFinal = valorCarro * (1 + acrescimo);
            double valorParcela = precoFinal / parcelas;
            exibirLinhaTabela(parcelas, precoFinal, valorParcela);
        }

        input.close();
    }

    private static void exibirLinhaTabela(int parcelas, double precoFinal, double valorParcela) {
        System.out.printf("%d\t\tR$ %.2f\t\tR$ %.2f%n", parcelas, precoFinal, valorParcela);
    }
}
