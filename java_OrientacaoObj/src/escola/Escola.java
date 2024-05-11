package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		
		felipe.setNome("Felipe");
		felipe.setIdade(32);
		felipe.setSexo("Masculino");
		
		System.out.printf("O aluno %s tem %d anos\n", 
				felipe.getNome(), felipe.getIdade());
		System.out.println("O seu sexo: " + felipe.getSexo());
	}
}
