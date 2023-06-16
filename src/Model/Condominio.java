package Model;

public class Condominio {
	private Endereco endereco;
	private String areasLazer;
	
	
	public Condominio(String areasLazer, int cep, String logradouro, int numero, String complemento, String bairro) {
		super();
		this.endereco = new Endereco(cep, logradouro, numero, complemento, bairro);
		this.areasLazer = areasLazer;
	}


	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getAreasLazer() {
		return areasLazer;
	}
	public void setAreasLazer(String areasLazer) {
		this.areasLazer = areasLazer;
	}
	
	
}
