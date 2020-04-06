package br.lasalle.oop.trab1;

public class Monitor {
	String marca;
	String cor;
	int tamanho;
	boolean ligado;

	void exibir()
	{
		if(ligado)
			System.out.println("Mostrou imagem na tela");
		else
			System.out.println("IMPOSSIVEL EXIBIR IMAGEM");
	}
	
	void ligar()
	{
		ligado = true;
	}
	
	void desligar()
	{
		ligado = false;
	}
		
}

