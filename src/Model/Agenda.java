package Model;

import java.util.ArrayList;
import java.util.Date;

public class Agenda {
	private ArrayList<Date> datasDisponivel;
	private ArrayList<Date> datasBloqueado;
	private ArrayList<Date> datasAugado;
	
	
	public String toString() {
		String retorno = "";
		
		retorno += "Datas disponíveis: \n";
		for(Date dD: datasDisponivel) {
			retorno += "\t" + dD.toString() + "\n";
		}
		retorno += "Datas bloqueado: \n";
		for(Date dB: datasBloqueado) {
			retorno += "\t" + dB.toString() + "\n";
		}
		retorno += "Datas alugado: \n";
		for(Date dA: datasAugado) {
			retorno += "\t" + dA.toString() + "\n";
		}
		return retorno;
	}
	
	public Agenda(ArrayList<Date> datasDisponivel, ArrayList<Date> datasBloqueado, ArrayList<Date> datasAugado) {
		this.datasDisponivel = datasDisponivel;
		this.datasBloqueado = datasBloqueado;
		this.datasAugado = datasAugado;
	}
	
	public ArrayList<Date> getDatasDisponivel() {
		return datasDisponivel;
	}
	public void setDatasDisponivel(ArrayList<Date> datasDisponivel) {
		this.datasDisponivel = datasDisponivel;
	}
	public ArrayList<Date> getDatasBloqueado() {
		return datasBloqueado;
	}
	public void setDatasBloqueado(ArrayList<Date> datasBloqueado) {
		this.datasBloqueado = datasBloqueado;
	}
	public ArrayList<Date> getDatasAugado() {
		return datasAugado;
	}
	public void setDatasAugado(ArrayList<Date> datasAugado) {
		this.datasAugado = datasAugado;
	}
}
