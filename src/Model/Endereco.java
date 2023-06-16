package Model;

public class Endereco {
	private int cep;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private enum Estado {
	    AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO;
	}	
	private Estado estado;

	// Constructors
	public Endereco(int cep, String logradouro, int numero, String complemento, String bairro, String cidade, String estado) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.setEstado(estado);
	}
	public Endereco(int cep, String logradouro, int numero, String complemento, String bairro) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = "Salvador";
		this.estado = Estado.BA;
	}
	
	// Methods
	public String toString() {
		return "Endereço: " + this.logradouro + ". Nº: " + this.numero + ". " + this.complemento + ". "
					+ this.bairro + ", " + this.cidade + " - " + this.getEstado() + ". CEP: " + this.cep;
	}
	
	public void atualizaEndereco(int cep, String logradouro, int numero, String complemento, String bairro, String cidade, String estado) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.setEstado(estado);
	}
	public void atualizaEndereco(int cep, String logradouro, int numero, String complemento, String bairro) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
	}
	
	// Getters and Setters
	public String getEstado() {
		return estado.toString();
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public void setEstado(String estado) {
        try {
            this.estado = Estado.valueOf(estado);
        } catch (IllegalArgumentException e) {
            System.out.println("Sigla de estado inválida!");
        }
	}
		
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
