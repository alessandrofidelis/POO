public class AnimalTester {

	public static void main(String[] args) {

		Ave Ave = new Ave();
		Mamifero Mamifero = new Mamifero();
		Peixe Peixe = new Peixe();
		Reptil Reptil = new Reptil();
		Canguru Canguru = new Canguru();
		
		Ave.setCorPena("Marrom");
		Ave.setIdade(3);
		Ave.setMembros(2);
		Ave.setPeso(3);
		Ave.mostrar();
		Ave.fazerNinho();
		Ave.alimentar();
		Ave.emitirSom();
		Ave.locomover();
		System.out.println("******************************************");
		
		Mamifero.setIdade(6);
		Mamifero.setMembros(4);
		Mamifero.setPeso(30);
		Mamifero.setCorPelo("Preto");
		Mamifero.mostrar();
		Mamifero.alimentar();
		Mamifero.emitirSom();
		Mamifero.locomover();
		System.out.println("******************************************");
		
		Peixe.setCorEscama("Prata");
		Peixe.setMembros(3);
		Peixe.setIdade(1);
		Peixe.setPeso(1);
		Peixe.mostrar();
		Peixe.soltarBolha();
		Peixe.alimentar();
		Peixe.emitirSom();
		Peixe.locomover();
		System.out.println("******************************************");
		
		Reptil.setIdade(4);
		Reptil.setMembros(5);
		Reptil.setPeso(10);
		Reptil.setCorEscama("Marrom");
		Reptil.mostrar();
		Reptil.alimentar();
		Reptil.emitirSom();
		Reptil.locomover();
		System.out.println("******************************************");
		Canguru.setIdade(5);
		Canguru.setMembros(2);
		Canguru.setCorPelo("Marrom");
		Canguru.setPeso(30);
		Canguru.mostrar();
		Canguru.locomover();
		Canguru.emitirSom();
		Canguru.alimentar();
		
		
	}
}