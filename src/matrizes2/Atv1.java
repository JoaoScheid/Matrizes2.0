package matrizes2;

import java.util.Scanner;

public class Atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc= new Scanner(System.in);
		
		int matriz[][]= new int[5][5],
			contadorPar=0, somaPar = 0, medPar = 0;
		
		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<5;coluna++) {
				System.out.println(" Digite o valor da posição["+linha+"]["+coluna+"]");
				matriz[linha][coluna]= sc.nextInt();
				
				boolean verificaPar= matriz[linha][coluna]%2==0;
				
				if(verificaPar==true) {
					contadorPar++;
					somaPar+= matriz[linha][coluna];
					medPar= somaPar/contadorPar;
				}
				
			}
	}
		System.out.println("A média dos números pares é: "+medPar);
	}

}
