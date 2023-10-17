package matrizes2;

import java.util.Scanner;

public class Atv5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		double M[][]= new double[3][4];
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<4;coluna++) {
				System.out.println(" Digite o valor da posição["+linha+"]["+coluna+"]");
				M[linha][coluna]= sc.nextDouble();
			}
		}
		for(int linha=0;linha<1;linha++) {
		}
		for(int coluna=0;coluna<1;coluna++) {
			System.out.println("Canto superior esquerdo["+M[0][0]+"] e canto inferior esquerdo ["+M[2][0]+"]");
		}
	}

}
