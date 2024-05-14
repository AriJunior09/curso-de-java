package mesageria;

import apps.Facebook;
import apps.MsnMessenger;
import apps.ServicoMensagem;
import apps.Telegram;

public class MeuComputador {
	public static void main(String[] args) {
		ServicoMensagem servico = null;
		
		/* Exemplo de caso: Não se sabe qual o app
		 * Pedrinho vai escolher para enviar e receber
		 * mensagens;*/
		
		String appEscolhido = "tlg";
		
		if(appEscolhido.equals("msn")) {
			servico = new MsnMessenger();
		}else if(appEscolhido.equals("fcb")) {
			servico = new Facebook();
		}else if(appEscolhido.equals("tlg")) {
			servico = new Telegram();
		}
		
		servico.enviarMensagem();
		servico.salvarHistoricoMensagem();
		servico.receberMensagem();
		
	}
}
