package pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		
		Pessoa marcos = new Pessoa("Marcos", "04453621321");
		
		marcos.setEndereco("Rua das Marias");
		System.out.println("Nome: " + marcos.getNome());
		System.out.println("CPF: " + marcos.getCpf());
		System.out.println("Endereço: " + marcos.getEndereco());
	}
}
