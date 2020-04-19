public class Mamifero extends Animal {
	private String corPelo;
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Mam�fero em locomo��o");
	}

	@Override
	public void alimentar() {
		System.out.println("Mam�fero comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Mam�fero fazendo barulho");
	}
}