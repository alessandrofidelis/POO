package Futebol;

import java.util.Scanner;

public class PartidaTester{
	
	
	public static void main(String[] args){
		
		Scanner var = new Scanner(System.in);
		
		System.out.printf("Iniciando as partidas da rodada do Brasileirão\n");
		
		for (int i = 1; i < 4; i++) {
			
			System.out.printf("Vai comecar a partida numero %d \n", i);
			
			Time timeLocal = new Time();
			Time timeVisitante = new Time();
			Partida partida = new Partida();

			System.out.println("Entre com o time 1:");
			
			timeLocal.setNome(var.next());
			partida.setTimeLocal(timeLocal);
			
			System.out.println("Entre com o time 2:");
			
			timeVisitante.setNome(var.next());
			partida.setTimeVisitante(timeVisitante);
				
			System.out.printf("Preparando o jogo n.%d\n", i);
			timeLocal.listar();
			System.out.println("\n");
			timeVisitante.listar();
			
			System.out.println("Pronto para iniciar a partida?  <Pressione uma tecla>");
			try {System.in.read();}
			catch(Exception e) {}
			
			partida.iniciarPartida();
			partida.mostrarResultado();
			partida.finalizarPartida();
			timeLocal.listar();
			System.out.println("\n");
			timeVisitante.listar();
			
		}
		
		System.out.println("##########################################");
		System.out.println("##############FIM DE RODADA###############");
		System.out.println("##########################################");
		System.out.println("##########################################");
		System.out.println("Artilheiro: Alessandro Fidelis");
		System.out.println("##########################################");
		System.out.println("Github:https://github.com/alessandrofidelis/POO/tree/master/TrabalhoFutebol");
		System.out.println("##########################################");
		System.out.println("Video Youtube:https://youtu.be/vQCirYLjyUs");
		
		var.close();
}
}
