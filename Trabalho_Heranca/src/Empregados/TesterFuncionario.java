package Empregados;

import java.util.Scanner;
public class TesterFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		Scanner scan = new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("Nome: Alessandro Fidelis");
		System.out.println("Matricula:0050010917");
		System.out.println("***********************************");
		funcionario.setNome("Alessandro");
		funcionario.setCpf("123.456.789-10");
		funcionario.setSalario(2000.0f);
		funcionario.getBonificacao();
		funcionario.listar();

		
		System.out.println("Entre com a sua senha:");
		int pass = scan.nextInt();
		if(gerente.autentica(pass)) {
		gerente.setNome("Thelma");
		gerente.setCpf("987.654.321-00");
		gerente.setSalario(6000.0);
		gerente.setNumeroDeFuncionariosGerenciados(20);
		gerente.getBonificacao();
		gerente.listar();
		}
		else {
			System.out.println("Acesso Negado!!"); 
		}		
	}
}
