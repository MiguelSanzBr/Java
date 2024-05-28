package gd;

import java.util.Scanner;

public class yesorno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	 	int conty = 0;
	 	int contn = 0;
					int contm = 0;
					int conth = 0;
					int conthn = 0;
        for (int i = 0; i < 10; i++) {
        	System.out.print("\n 1-homem \n 2-mulher\n informe seu Sexo:");
        	int sexo = scanner.nextInt();
        	System.out.print("\n S-sim \n N-não \n Voce gostou do novo Produto:");
        	String reply = scanner.next().toUpperCase();
        	System.out.print("--------\n");
        	switch(reply) {
        	case "S":
        		conty ++;
        	break;
        	case "N":
        		contn ++;
        	break;
        					default:
        					System.out.print("Responda com um cacter Valido");
        					break;
        	}
        				if (sexo == 2 && reply.equals("S")){
        								contm ++;
        				}
        	
        				if (sexo == 1) {
        conth++;
        if (reply.equals("N")) {
            conthn++;
        }
        				}
            }
					double porc = ((double) conthn / conth) * 100;

        System.out.print("a quantidade de pessoas que responderam SIM são:"+conty+"\n");
        System.out.print("a quantidade de pessoas que responderam NÃO são:"+contn+"\n");
					System.out.print("a quantidade de Mulheres que responderam Sim são:"+contm+"\n");
					System.out.print("a porcentagem de Homens que responderam NÂO são:"+porc+"% \n");
	}

}
