package program;

/*
beecrowd | 1060 - Números Positivos

Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int j = 0;
		for (int i = 0; i < 6; i++) {
			double valor = sc.nextDouble();
			if(valor >= 0) {
				j += 1;
			}
		}
		System.out.println(j + " valores positivos");
		sc.close();
	}
}
