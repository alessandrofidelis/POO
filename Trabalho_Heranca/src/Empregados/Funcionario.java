package Empregados;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	
// Inicio Getter e Setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	//Fim Getter e Setter
	
	public double getBonificacao() {
		return this.salario*0.2;
	}

public double setBonificacao() {
	
	
	return setBonificacao();
}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}

	public void listar() {
		System.out.println("Bonificação: "+getBonificacao());
		System.out.println(this.toString());
	}

}
