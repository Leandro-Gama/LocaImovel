package Model;

import java.util.ArrayList;

public class Proprietario {
	private String nome;
	private int cpf;
	private int identidade;
	private Endereco endereco;
	private ArrayList<Imovel> imoveisDisponiveis;
	


	// Constructors
	public Proprietario(String nome, int cpf, int identidade, int cep, String logradouro, int numero, String complemento, String bairro, 
						String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.identidade = identidade;
		this.endereco = new Endereco(cep, logradouro, numero, complemento, bairro, cidade, estado);
		this.imoveisDisponiveis = new ArrayList<Imovel>();
	}
	
	public Proprietario(String nome, int cpf, int identidade, int cep, String logradouro, int numero, String complemento, String bairro) {
		this.nome = nome;
		this.cpf = cpf;
		this.identidade = identidade;
		this.endereco = new Endereco(cep, logradouro, numero, complemento, bairro);
		this.imoveisDisponiveis = new ArrayList<Imovel>();
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\tCPF: " + this.cpf + "\tQtdd Imóveis: " + this.imoveisDisponiveis.size()  ;
	}
	// Methods
	public void atualizaEndereco(int cep, String logradouro, int numero, String complemento, String bairro, String cidade, String estado) {
		this.endereco.atualizaEndereco(cep, logradouro, numero, complemento, bairro, cidade, estado);;
	}
	public void atualizaEndereco(int cep, String logradouro, int numero, String complemento, String bairro) {
		this.endereco.atualizaEndereco(cep, logradouro, numero, complemento, bairro);;
	}
	public void addImovel(Imovel imovel) {
		this.imoveisDisponiveis.add(imovel);
	}
	public void listarImoveisPorTipo(String tipoImovel) {
		for(int i=0; i< this.imoveisDisponiveis.size(); i++) {
			if(this.imoveisDisponiveis.get(i).getTipo().equals(tipoImovel)) {
				System.out.println(this.imoveisDisponiveis.get(i).toString());
			}
		}
	}

	// Getters and Setters
	public ArrayList<Imovel> getImoveisDisponiveis() {
		return imoveisDisponiveis;
	}

	public void setImoveisDisponiveis(ArrayList<Imovel> imoveisDisponiveis) {
		this.imoveisDisponiveis = imoveisDisponiveis;
	}
	
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
