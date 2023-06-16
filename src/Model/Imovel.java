package Model;

public abstract class Imovel {
	private int iptu;
	private Endereco endereco;
	private String tipo;
	private String utilizacao;
	private Agenda agenda;
	
	// Constructors
	public Imovel(int iptu, String tipo, String utilizacao, int cep, String logradouro, int numero, String complemento, String bairro,
				  String cidade, String estado) {
		this.iptu = iptu;
		this.endereco = new Endereco(cep, logradouro, numero, complemento, bairro, cidade, estado);
		this.tipo = tipo;
		this.utilizacao = utilizacao;
	}

	public Imovel(int iptu, String tipo, String utilizacao, int cep, String logradouro, int numero, String complemento, String bairro) {
		this.iptu = iptu;
		this.endereco = new Endereco(cep, logradouro, numero, complemento, bairro);
		this.tipo = tipo;
		this.utilizacao = utilizacao;
	}
	
	// Methods
	public void atualizaEndereco(int cep, String logradouro, int numero, String complemento, String bairro, String cidade, String estado) {
		this.endereco.atualizaEndereco(cep, logradouro, numero, complemento, bairro, cidade, estado);;
	}
	public void atualizaEndereco(int cep, String logradouro, int numero, String complemento, String bairro) {
		this.endereco.atualizaEndereco(cep, logradouro, numero, complemento, bairro);;
	}
	public String toString() {
		String retorno = "Tipo: " + this.tipo + "\tUtilização: " + this.utilizacao + "\tIPTU: " + this.iptu + "\t" + this.endereco.toString() ;
		
		if(this.agenda != null) {
			retorno += "\t" + this.agenda.toString();
		}
		return retorno;
	}
	
	// Getters and Setters
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

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
}
