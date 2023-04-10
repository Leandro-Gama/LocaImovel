package Model;

public class Proprietario {
	private String nome;
	private int cpf;
	private int identidade;
	private Endereco endereco;
	
	// Constructors
	public Proprietario(String nome, int cpf, int identidade, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.identidade = identidade;
		this.endereco = endereco;
	}
	
	// Getters e Setters	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdentidade() {
		return identidade;
	}
	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
