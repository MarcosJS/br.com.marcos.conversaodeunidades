package br.com.marcos.conversaodeunidades;

public class Main {
	
	public static void main(String[] args) {
		
		ConversaoDeUnidadesDeTempo c = new ConversaoDeUnidadesDeTempo();
		
		System.out.println("2 minutos equivalem a	" +ConversaoDeUnidadesDeTempo.convMinParaSeg(2)+" segundos!");
		System.out.println("2 horas equivalem a	" +ConversaoDeUnidadesDeTempo.convHoraParaMin(2)+" minutos!");
		System.out.println("2 dias equivalem a	" +ConversaoDeUnidadesDeTempo.convDiaParaHoras(2)+" horas!");
		System.out.println("2 semanas equivalem a 	" +ConversaoDeUnidadesDeTempo.convSemanaParaDias(2)+" dias!");
		System.out.println("2 meses equivalem a 	" +ConversaoDeUnidadesDeTempo.convMesParaDias(2)+" dias!");
		System.out.println("2 anos equivalem a 	" +ConversaoDeUnidadesDeTempo.convAnosParaDias(2)+" dias!");
		
		System.out.println("2 anos equivalem a 	" +c.convAnosParaSegundos(2)+" segundos!");
		
	}
	
}
