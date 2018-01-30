package br.ifpb.edu;

public class CasaConfortoFactory extends CasaFactory {

	@Override
	public Piso criarPiso() {
		return new PisoConforto();
	}

	@Override
	public Parede criarParede() {
		return new ParedeConforto();
	}

	@Override
	public Porta criarPorta() {
		return new PortaConforto();
	}

	@Override
	public Tinta criarTinta() {
		return new TintaConforto();
	}

	@Override
	public Metal criarMetal() {
		return new MetalConforto();
	}

	@Override
	public Louca criarLouca() {
		return new LoucaConforto();
	}
	
}
