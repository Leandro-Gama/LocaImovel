package Model;

public class Imovel {
	private int iptu;
	private Endereco endereco;
	private String tipo;
	private String utilizacao;
	
	// Constructors
	public Imovel(int iptu, Endereco endereco, String tipo, String utilizacao) {
		this.iptu = iptu;
		this.endereco = endereco;
		this.tipo = tipo;
		this.utilizacao = utilizacao;
	}
	
	// Getters e Setters
	public int getIptu() {
		return iptu;
	}
	public void setIptu(int iptu) {
		this.iptu = iptu;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUtilizacao() {
		return utilizacao;
	}
	public void setUtilizacao(String utilizacao) {
		this.utilizacao = utilizacao;
	}
	
}
