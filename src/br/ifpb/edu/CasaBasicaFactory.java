package br.ifpb.edu;

public class CasaBasicaFactory extends CasaFactory {

	@Override
	public Piso criarPiso() {
		return new PisoBasico();
	}

	@Override
	public Parede criarParede() {
		return new ParedeBasico();
	}

	@Override
	public Porta criarPorta() {
		return new PortaBasica();
	}

	@Override
	public Tinta criarTinta() {
		return new TintaBasico();
	}

	@Override
	public Metal criarMetal() {
		return new MetalBasico();
	}

	@Override
	public Louca criarLouca() {
		return new LoucaBasica();
	}

}
