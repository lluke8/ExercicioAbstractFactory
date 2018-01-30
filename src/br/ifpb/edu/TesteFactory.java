package br.ifpb.edu;

public class TesteFactory {
	
	private static Casa montarCasa(String tipo) {
		CasaFactory cf = null;
		
		switch(tipo) {
		case "basico":
			cf = new CasaBasicaFactory();
			break;
			
		case "conforto":
			cf = new CasaConfortoFactory();
			break;
			
		case "luxo":
			cf = new CasaLuxoFactory();
			
		}
		Casa casa = new Casa();
		casa.setLouca(cf.criarLouca());
		casa.setMetal(cf.criarMetal());
		casa.setParede(cf.criarParede());
		casa.setPiso(cf.criarPiso());
		casa.setPorta(cf.criarPorta());
		casa.setTinta(cf.criarTinta());
		
		return casa;
	}
	
	private static void main(String args[]) {
		Casa c1 = montarCasa("basico");
		Casa c2 = montarCasa("conforto");
		Casa c3 = montarCasa("luxo");

	}
}
