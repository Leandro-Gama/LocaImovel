package Model;

public class UnidadeAutonoma extends Imovel{

	private float areaUtil;
	private float areaOcupada;
	
	public UnidadeAutonoma(int iptu, String tipo, String utilizacao, int cep, String logradouro, int numero,
			String complemento, String bairro, String cidade, String estado, float areaUtil, float areaOcupada) {
		super(iptu, tipo, utilizacao, cep, logradouro, numero, complemento, bairro, cidade, estado);
		this.areaUtil = areaUtil;
		this.areaOcupada = areaOcupada;
	}

	
	
	
	public float getAreaUtil() {
		return areaUtil;
	}

	public void setAreaUtil(float areaUtil) {
		this.areaUtil = areaUtil;
	}

	public float getAreaOcupada() {
		return areaOcupada;
	}

	public void setAreaOcupada(float areaOcupada) {
		this.areaOcupada = areaOcupada;
	}
}
