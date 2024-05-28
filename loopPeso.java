package gd;

import java.util.Scanner;

public class loopPeso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cntp = 0;
		int cnti = 0;
		double media = 0;
        for (int i = 0; i < 7; i++) {
        	System.out.print("Digite sua idade: ");
        	int id = scanner.nextInt();
        	System.out.print("Digite seu peso: ");
        	double peso = scanner.nextDouble();
        	System.out.print("--------\n");
        	if (peso > 90) {
        		cntp ++;
        	}
        	cnti = id + cnti;
            }
        media = cnti / 7;
        System.out.print("a media das idades são:"+media+"\n");
        System.out.print("a quantidade de pessoas acima dos 90 kg são: "+cntp);
  }	
}
