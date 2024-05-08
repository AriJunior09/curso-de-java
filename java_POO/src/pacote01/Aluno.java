package pacote01;

public class Aluno {
	private String nome;
	private int idade;
	private String cor;
	private String sexo;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade, String cor, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", cor=" + cor + ", sexo=" + sexo + "]";
	} 
	
	
	

}
