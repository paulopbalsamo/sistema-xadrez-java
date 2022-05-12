package Xadrez;

import Tabuleiro.Tabuleiro;

public class PartidadeXadrez {

	private Tabuleiro tabuleiro;

	public PartidadeXadrez() {
		tabuleiro = new Tabuleiro(8, 8); // quem tem que saber a dimensao é classe partidadexadrez
	}

	public PecadeXadrez[][] retornaPecas() {
		PecadeXadrez[][] mat = new PecadeXadrez[tabuleiro.getQtdeLinhas()][tabuleiro.getQtdeColunas()];
		for (int i = 0; i < tabuleiro.getQtdeLinhas(); i++) { // percorre as linhas
			for (int j = 0; j < tabuleiro.getQtdeColunas(); j++) { // percorre as colunas
				mat[i][j] = (PecadeXadrez) tabuleiro.peca(i, j);
			}

		}
		return mat;
	}

}
