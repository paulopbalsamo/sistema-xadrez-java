package app;

import Xadrez.PecadeXadrez;

public class Ui {

	public static void printTabuleiro(PecadeXadrez[][] pecas) {
		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length; j++) {
				printPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	private static void printPeca(PecadeXadrez peca) { // metodo auxiliar imprimir 1 pe�a
		if (peca == null) {
			System.out.print("-");

		} else {
			System.out.print(peca);
		}
		System.out.print(" "); // espa�o pra nao ficar grudado umas nas outras

	}

}
