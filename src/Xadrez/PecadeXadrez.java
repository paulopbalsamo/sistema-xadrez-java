package Xadrez;

import Tabuleiro.Peca;
import Tabuleiro.Tabuleiro;

public class PecadeXadrez extends Peca {

	private Cores cor;

	public PecadeXadrez(Tabuleiro tabuleiro, Cores cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

}
