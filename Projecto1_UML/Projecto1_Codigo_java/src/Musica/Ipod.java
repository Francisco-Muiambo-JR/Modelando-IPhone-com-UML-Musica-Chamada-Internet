package Musica;

public class Ipod implements ReprodutorMusical {
	private int volume = 25;

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando a musica");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Selecionando a musica: " + musica);
	}

	@Override
	public int aumentarVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int diminuirVolume() {
		// TODO Auto-generated method stub
		return volume++;
	}

}
