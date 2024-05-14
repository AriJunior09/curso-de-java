package apps;

public class Telegram extends ServicoMensagem{
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico de mensagem do Telegram");
	}

}