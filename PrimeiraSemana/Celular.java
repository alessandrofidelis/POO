package br.lasalle.oop.trab1;

public class Celular {
	String marca;
	String cor;
	float preco;
	boolean descarregado;

	void carregar()
	{
		if(!descarregado)
			System.out.println("Coloque para carregar");
		else
			System.out.println("Ligue e utilize" );
	}
	
	void usarcarregador()
	{
		descarregado = false;
	}
	
	void naousarcarregador()
	{
		descarregado = true;
	}
}
