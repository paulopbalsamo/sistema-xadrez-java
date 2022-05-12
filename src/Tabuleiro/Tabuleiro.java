package Tabuleiro;

public class Tabuleiro {

	private int qtdeLinhas;
	private int qtdeColunas;
	private Peca[][] pecas; //matriz de peças

	public Tabuleiro(int qtdeLinhas, int qtdeColunas) {
		super();
		this.qtdeLinhas = qtdeLinhas;
		this.qtdeColunas = qtdeColunas;
		pecas = new Peca[qtdeLinhas][qtdeColunas];
	}

	public int getQtdeLinhas() {
		return qtdeLinhas;
	}

	public void setQtdeLinhas(int qtdeLinhas) {
		this.qtdeLinhas = qtdeLinhas;
	}

	public int getQtdeColunas() {
		return qtdeColunas;
	}

	public void setQtdeColunas(int qtdeColunas) {
		this.qtdeColunas = qtdeColunas;
	}

	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

}
