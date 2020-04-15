package Empregados;

public class Gerente extends Funcionario   {
	private int senhaEspecial;
	private int numeroDeFuncionariosGerenciados; 
	
	public Gerente(){
		senhaEspecial = 1234;
		
	}
	
public boolean autentica(int senhaEspecial) {
this.senhaEspecial=1234;

if(senhaEspecial==this.senhaEspecial) {

	System.out.println("Acesso Permitido!!");
	return true;
}
else {
	
	return false;	
}

}

	
public int getNumeroDeFuncionariosGerenciados() {
	return numeroDeFuncionariosGerenciados;
}

public int getSenhaEspecial() {
	return senhaEspecial;
}


public void setSenhaEspecial(int senhaEspecial) {
	this.senhaEspecial = senhaEspecial;
}


public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
	this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
}


@Override
public double getBonificacao() {
	
	return (super.getBonificacao()+1000); 
		
}		
	

@Override
public void listar() {
	System.out.println("Bonificação: "+getBonificacao());
	System.out.println("Quantidade de Funcionarios: "+getNumeroDeFuncionariosGerenciados());
	System.out.println(this.toString());
	
}

}
