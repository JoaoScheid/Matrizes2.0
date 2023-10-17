package matrizes2;

import java.util.Scanner;

public class Atv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int M[][]= new int[5][5],
				somaLinha = 0,somaColuna = 0, somaMatriz=0, somaDiagonal=0, somaDiagonalSec=0;
		
		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<5;coluna++) {
				System.out.println(" Digite o valor da posição["+linha+"]["+coluna+"]");
				M[linha][coluna]= sc.nextInt();
				
				somaMatriz+= M[linha][coluna];
				if(linha==3) {
					somaLinha+= M[linha][coluna];
				}
				if(coluna==1) {
					somaColuna+= M[linha][coluna];
				}
				if(linha==coluna) {
					somaDiagonal+= M[linha][coluna];
				}
				if(linha+coluna==4) {
					somaDiagonalSec+=M[linha][coluna];
				}
	}
   }
		for(int linha=0;linha<1;linha++) {
			for(int coluna=0;coluna<1;coluna++) {
				System.out.println("A soma dos valores da linha 4 é "+somaLinha);
				System.out.println("A soma dos valores da coluna 2 é "+somaColuna);
				System.out.println("A soma dos elementos da diagonal principal é "+somaDiagonal);
				System.out.println("A soma dos elementos da diagonal secundária é "+somaDiagonalSec);
				System.out.println("A soma de todos os valores da matriz é "+somaMatriz);
				
			}
		}
		
		for(int linha=0;linha<5;linha++) {
			System.out.println( );
			for(int coluna=0;coluna<5;coluna++) {
				System.out.print(M[linha][coluna] + " ");
			}
		}
  }
}
