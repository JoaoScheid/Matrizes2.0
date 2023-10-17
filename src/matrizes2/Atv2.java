package matrizes2;

import java.util.Scanner;

public class Atv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 
		 int matriz[][]= new int[7][4],
				 menorValor=999999999, menorLinha=0, menorColuna=0;
		 
		 for(int linha=0;linha<7;linha++) {
				for(int coluna=0;coluna<4;coluna++) {
					System.out.println(" Digite o valor da posição["+linha+"]["+coluna+"]");
					matriz[linha][coluna]= sc.nextInt();
					
					if(matriz[linha][coluna]<menorValor) {
						menorValor=matriz[linha][coluna];
						menorLinha=linha;
						menorColuna=coluna;
					}
					
				}
		 }
		 menorLinha++;
		 menorColuna++;
		 System.out.println("O menor valor é "+menorValor);
		 System.out.println("E se encontra na coluna["+menorColuna+"] e linha ["+menorLinha+"]");
	}

}
