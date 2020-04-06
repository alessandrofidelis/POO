package Futebol;

public class Time {
	private String nome;
	private int qtdVitorias;
	private int qtdEmpates;
	private int qtdDerrotas;
	private int qtdPontos;
	
	public Time() // Construtor
	{
		qtdVitorias = 0;
		qtdEmpates  = 0;
		qtdDerrotas = 0;
		qtdPontos  = 0;
	}

	// Getter e Setter

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdVitorias() {
		return qtdVitorias;
	}

	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}

	public int getQtdEmpates() {
		return qtdEmpates;
	}

	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}

	public int getQtdDerrotas() {
		return qtdDerrotas;
	}

	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}

	public int getQtdPontos() {
		return qtdPontos;
	}

	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}

	public void listar() {
		System.out.println("Time:" + this.getNome());
		System.out.println("Vitórias:" + this.getQtdVitorias());
		System.out.println("Empates:" + this.getQtdEmpates());
		System.out.println("Derrotas:" + this.getQtdDerrotas());
		System.out.println("Pontos:" + this.getQtdPontos());
		

	}	
}
