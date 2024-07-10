package Iphone;

import Internet.NavegadorInternet;
import Musica.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	private int volume = 25;

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		verificarConectividade();
		System.out.println("Exibindo pagina");

	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova Aba");

	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		verificarConectividade();
		System.out.println("Actualizando a pagina");
	}

	@Override
	public void baixarArquivo() {
		// TODO Auto-generated method stub
		System.out.println("Baixando Arquivo");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		verificarRede();
		System.out.println("Fazendo ligacão para " + numero);
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo chamada");
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.println("digando chamada");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando Correio de Voz");
	}

	@Override
	public void gravarNumero(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Gravando numero " + numero);
	}

	@Override
	public void adicionarEstrela(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Adicionando estrela ao numero " + numero);
	}

	private void verificarConectividade() {
		System.out.println("Verificando Conectividade");
	}

	private void verificarRede() { // TODO Auto-generated method stub
		System.out.println("Verificando a rede");
	}

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
		return volume++;
	}
	
	@Override
	public int diminuirVolume() {
		return volume++;
	}

}
