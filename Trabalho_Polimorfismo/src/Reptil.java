public class Reptil extends Animal {
	
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("R�ptil andando");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void alimentar() {
		System.out.println("R�ptil comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("R�ptil fazendo barulho");
	}
}