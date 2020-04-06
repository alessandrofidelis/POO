package Futebol;

public class Partida {
	private Time timeVisitante;
	private Time timeLocal;
	private int scoreVisitante;
	private int scoreLocal;

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public Time getTimeLocal() {
		return timeLocal;
	}

	public void setTimeLocal(Time timeLocal) {
		this.timeLocal = timeLocal;
	}

	public int getScoreVisitante() {
		return scoreVisitante;
	}

	public void setScoreVisitante(int scoreVisitante) {
		this.scoreVisitante = scoreVisitante;
	}

	public int getScoreLocal() {
		return scoreLocal;
	}

	public void setScoreLocal(int scoreLocal) {
		this.scoreLocal = scoreLocal;
	}

	public int Random_Placar(int min, int max) {
		int numrandom = (int) ((Math.random() * ((max - min) + 1)) + min);
		return numrandom;
	}

	public void iniciarPartida() {
		
		scoreVisitante = Random_Placar(0,10);
		scoreLocal = Random_Placar(0,10);
		
	}

	public void mostrarResultado() {
		System.out.println(timeLocal.getNome()+" "+scoreLocal+ " X "+scoreVisitante+" "+timeVisitante.getNome());


	}

	public void finalizarPartida() {
		
		if(scoreLocal > scoreVisitante)
		{
			// Vitoria time local
			timeLocal.setQtdVitorias(timeLocal.getQtdVitorias() + 1); 
			timeLocal.setQtdPontos(timeLocal.getQtdPontos() + 3);
			// Derrota time visitante
			timeVisitante.setQtdDerrotas(timeVisitante.getQtdDerrotas() + 1);
		}
		else if (scoreLocal == scoreVisitante)
		{	// Time Local Empate
			timeLocal.setQtdEmpates(timeLocal.getQtdEmpates()+1);
			timeLocal.setQtdPontos(timeLocal.getQtdPontos()+1);
			// Time Visitante Empate
			timeVisitante.setQtdEmpates(timeVisitante.getQtdEmpates()+1);
			timeVisitante.setQtdPontos(timeVisitante.getQtdPontos()+1);
		}
		else
		{
			// Vitoria time Visitante
			timeVisitante.setQtdVitorias(timeVisitante.getQtdVitorias() + 1);
			timeVisitante.setQtdPontos(timeVisitante.getQtdPontos() +3);
			// Derrota time Local
			timeLocal.setQtdDerrotas(timeLocal.getQtdDerrotas() + 1);
		}
	}

	
}


