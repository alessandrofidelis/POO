public abstract class Animal {
	
	private int peso;
	private int idade;
	private int membros;
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getMembros() {
		return membros;
	}
	
	public void setMembros(int membros) {
		this.membros = membros;
	}
	
	
	@Override
	public String toString() {
		return "Animal [peso=" + peso + ", idade=" + idade + ", membros=" + membros + "]";
	}
	public void mostrar() {
		System.out.println(this.toString());
	}

	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirSom();
	
}