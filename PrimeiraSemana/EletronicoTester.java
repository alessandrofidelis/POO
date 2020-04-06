package br.lasalle.oop.trab1;

public class EletronicoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Monitor novomonitor = new Monitor();
		novomonitor.marca = "Samsung";
		novomonitor.cor = "Preto";
		novomonitor.tamanho = 25;
		novomonitor.desligar();
		novomonitor.exibir();
		
		Celular novocelular = new Celular();
		novocelular.marca = "Samsung";
		novocelular.cor = "Prata";
		novocelular.preco = 2.500f;
		novocelular.usarcarregador();
		novocelular.carregar();
	}

}
