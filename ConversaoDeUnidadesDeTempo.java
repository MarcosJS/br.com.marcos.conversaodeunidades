package br.com.marcos.conversaodeunidades;

public class ConversaoDeUnidadesDeTempo {
	
	static int convMinParaSeg(int minuto) {
		return minuto * 60;
	}
	
	static int convHoraParaMin(int hora) {
		return hora * 60;
	}
	
	static int convDiaParaHoras(int dias) {
		return dias * 24;
	}
	
	static int convSemanaParaDias(int semanas) {
		return semanas * 7;
	}
	
	static int convMesParaDias(int meses) {
		return meses * 30;
	}
	
	static double convAnosParaDias(int anos) {
		return anos * 365.25;
	}
	
	int convAnosParaSegundos(int anos) {
		return convMinParaSeg(convHoraParaMin(convDiaParaHoras((int)convAnosParaDias(anos))));
	}
	
}
