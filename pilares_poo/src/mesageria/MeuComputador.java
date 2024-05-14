package mesageria;

public class MeuComputador {
	public static void main(String[] args) {
		
		// Abrindo o MSN
		MsnMessenger msn = new MsnMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println(" ");
		
		Facebook fcb = new Facebook();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		System.out.println(" ");
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();

	}
}
