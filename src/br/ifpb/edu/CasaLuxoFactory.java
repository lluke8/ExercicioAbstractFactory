package br.ifpb.edu;

public class CasaLuxoFactory extends CasaFactory{

	@Override
	public Piso criarPiso() {
		return new PisoLuxo();
	}

	@Override
	public Parede criarParede() {
		return new ParedeLuxo();
	}

	@Override
	public Porta criarPorta() {
		return new PortaLuxo();
	}

	@Override
	public Tinta criarTinta() {
		return new TintaLuxo();
	}

	@Override
	public Metal criarMetal() {
		return new MetalLuxo();
	}

	@Override
	public Louca criarLouca() {
		return new LoucaLuxo();
	}

}
