package app;

import Xadrez.PartidadeXadrez;

public class Programa {

	public static void main(String[] args) {

		PartidadeXadrez partidadeXadrez = new PartidadeXadrez();
		Ui.printTabuleiro(partidadeXadrez.retornaPecas());

	}

}
