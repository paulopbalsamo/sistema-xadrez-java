package Tabuleiro;

public class Tabuleiro {

	private int qtdeLinhas;
	private int qtdeColunas;
	private Peca [][] pecas;
	
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
	
	
	
	
	
	
}
