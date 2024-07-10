package Iphone;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone JR = new Iphone();
		
		JR.selecionarMusica("Eminem - Morckinbird");
		JR.tocar();
		JR.aumentarVolume();
		JR.aumentarVolume();
		JR.aumentarVolume();
		JR.aumentarVolume();
		JR.aumentarVolume();
		System.out.println();
		JR.ligar("+258 846050073");
		JR.gravarNumero("+258 846050073");
		JR.desligar();
		System.out.println();
		JR.exibirPagina("https://Fenix");
		JR.atualizarPagina();
	}
}
