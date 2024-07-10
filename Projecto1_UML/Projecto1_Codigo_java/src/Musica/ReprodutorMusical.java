package Musica;

public abstract interface ReprodutorMusical {
	public void tocar();
	public void pausar();
	public void selecionarMusica(String musica);
	public int aumentarVolume();
	public int diminuirVolume();
}
