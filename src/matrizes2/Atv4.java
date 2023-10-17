package matrizes2;

import java.util.Scanner;

public class Atv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int M2[][]= new int[5][5];
		int M[][]= new int[5][5];
		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<5;coluna++) {
				System.out.println(" Digite o valor da posição["+linha+"]["+coluna+"]");
				M[linha][coluna]= sc.nextInt();
				
				
				M2[linha][coluna]=M[linha][coluna]*M[linha][coluna]*M[linha][coluna];
				
			}
		}
		for(int linha=0;linha<5;linha++) {
			System.out.println( );
			for(int coluna=0;coluna<5;coluna++) {
				System.out.print(M2[linha][coluna]+ " ");
				
			}
			
			}
	}

}
