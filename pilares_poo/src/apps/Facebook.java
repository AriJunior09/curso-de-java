package apps;

public class Facebook extends ServicoMensagem{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
	}
	

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico de mensagem do Facebook");
	}
}

