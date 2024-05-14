package apps;

public class MsnMessenger extends ServicoMensagem{
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
	}
	

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
		
	}
	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico de mensagem do MSN");
	}

}

