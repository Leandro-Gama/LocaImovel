package Model;

public class UnidadeCompartilhada extends Imovel{
	private String identificacao;
	private Condominio condominio;

	
	public UnidadeCompartilhada(int iptu, String tipo, String utilizacao, int cep, String logradouro, int numero,
			String complemento, String bairro, String cidade, String estado, String identificacao,
			Condominio condominio) {
		super(iptu, tipo, utilizacao, cep, logradouro, numero, complemento, bairro, cidade, estado);
		this.identificacao = identificacao;
		this.condominio = condominio;
	}
	
	
	
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	public Condominio getCondominio() {
		return condominio;
	}
	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
	}
}
