
public class UTENTE {

	private String nome;
	private String genero;
	private int idade;
	private float altura;
	private int peso;
	
	
	
	public UTENTE(String nome, String genero, int idade, float altura, int peso) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	//Comentario após fazer o 1 commit 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "UTENTE [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", altura=" + altura + ", peso="
				+ peso + "]";
	}
	
	
}
