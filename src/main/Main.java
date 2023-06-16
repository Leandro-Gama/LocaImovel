package main;

import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;



public class Main {

	
	public static float getValorReferenciaImovel(Imovel imovel, int sazonalidade) {
		float retorno = 0f;
		int u = 0;
		
		if(imovel instanceof UnidadeAutonoma) {
			UnidadeAutonoma uniAtemp = (UnidadeAutonoma)imovel;
			retorno = uniAtemp.getAreaOcupada() * 15f;
		}
		else if (imovel instanceof UnidadeCompartilhada) {
			UnidadeCompartilhada uniComp = (UnidadeCompartilhada)imovel;
			
			int qtddlazer = uniComp.getCondominio().getAreasLazer().split(",").length;
			
			retorno =  uniComp.getIptu() * qtddlazer;
		}
		else {
			return 0f;
		}
		
		return retorno * (1 + sazonalidade);
	}
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		ArrayList<Proprietario> proprietarios = new ArrayList<Proprietario>();
		ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
		ArrayList<Agenda> agendas = new ArrayList<Agenda>();	
		
		int op = menu();
		while(op != 7) {
			switch(op) {
				case 1:
					System.out.println("Nome do propriet�rio: ");
					String nomeP = input.next();
					
					System.out.println("CPF do propriet�rio: ");
					int cpfP = input.nextInt();
	
					System.out.println("Identidade do propriet�rio: ");
					int identidadeP = input.nextInt();
	
					System.out.println("Endere�o: ");
					System.out.println("Logradouro: ");
					String logradouro = input.next();
	
					System.out.println("N�mero: ");
					int numero = input.nextInt();
	
					System.out.println("CEP: ");
					int cep = input.nextInt();
	
					System.out.println("Complemento: ");
					String complemento = input.next();
	
					System.out.println("Bairro: ");
					String bairro = input.next();
	
					System.out.println("Cidade: ");
					String cidade = input.next();
	
					System.out.println("Estado: ");
					String estado = input.next();
					
					Proprietario proprietario = new Proprietario(nomeP, cpfP, identidadeP, cep, logradouro, numero, complemento, bairro, cidade, estado);
					proprietarios.add(proprietario);
					break;
				case 2:
					System.out.println("Tipo de im�vel: ");
					String tipoI = input.next();
					
					System.out.println("Utilizacao do im�vel: ");
					String utilizacao = input.next();
	
					System.out.println("IPTU: ");
					int iptu = input.nextInt();
	
					System.out.println("Endere�o: ");
					System.out.println("Logradouro: ");
					String logradouroI = input.next();
	
					System.out.println("N�mero: ");
					int numeroI = input.nextInt();
	
					System.out.println("CEP: ");
					int cepI = input.nextInt();
	
					System.out.println("Complemento: ");
					String complementoI = input.next();
	
					System.out.println("Bairro: ");
					String bairroI = input.next();
	
					System.out.println("Cidade: ");
					String cidadeI = input.next();
	
					System.out.println("Estado: ");
					String estadoI = input.next();
					
					Imovel imovel = new UnidadeAutonoma(iptu, tipoI, utilizacao, cepI, logradouroI, numeroI, complementoI, bairroI, cidadeI, estadoI, 1000, 900);
					imoveis.add(imovel);
					
					System.out.println("Vincular a um propriet�rio? ");
					boolean vincularP = input.nextBoolean();
					
					if(vincularP) {
						System.out.println("CPF do Propriet�rio para vincular: ");
						int cpfPVincular = input.nextInt();
						int i=0;
						for(Proprietario p: proprietarios) {						
						    if(p.getCpf() == cpfPVincular) {
						    	p.addImovel(imovel);
						    	i++;
						    	break;
						    }
						}
						if(i==0) {
							System.out.println("Propriet�rio n�o localizado!");						
						}
					}
					break;
				case 3:
					System.out.println("Gerenciar Agenda:");
					System.out.println("1. Bloquear im�veis de propriet�rio;");
					System.out.println("2. Voltar ao menu anterior.;");
					
					if(new Scanner(System.in).nextInt() == 1) {
						System.out.println("CPF do Propriet�rio dos im�veis para bloquear: ");
						int cpfPVincular = input.nextInt();
						int i=0;
						for(Proprietario p: proprietarios) {						
						    if(p.getCpf() == cpfPVincular) {
						    	for(Imovel im : p.getImoveisDisponiveis()) {
						    		for(Date d : im.getAgenda().getDatasAugado()) {
							    		im.getAgenda().getDatasBloqueado().add(d);						    			
						    		}
						    		for(Date d : im.getAgenda().getDatasDisponivel()) {
							    		im.getAgenda().getDatasBloqueado().add(d);						    			
						    		}
						    		im.getAgenda().setDatasAugado(new ArrayList<Date>());
						    		im.getAgenda().setDatasDisponivel(new ArrayList<Date>());
						    	}
						    	break;
						    }
						}
						if(i==0) {
							System.out.println("Propriet�rio n�o localizado!");						
						}
					}
					
					break;
				case 4:
					int countP = 1;
					for(Proprietario p: proprietarios) {
						System.out.println(countP + " - " + p.toString() + "\n");
					}
					break;
				case 5:
					int countI = 1;
					for(Imovel im: imoveis) {
						System.out.println(countI + " - " + im.toString() + "\n");
					}
					break;
									
			}
			op = menu();
		}	
		System.out.println("Fim da aplica��o!");						
		
	}

	public static int menu() {
		System.out.println("-------Menu-------");
		System.out.println("1. Cadastrar propriet�rio;");
		System.out.println("2. Cadastrar im�vel;");
		System.out.println("3. Gerenciar agenda de im�vel;");
		System.out.println("4. Exibir propriet�rios;");
		System.out.println("5. Exibir im�veis;");
		System.out.println("6. Exibir agenda de im�vel");		
		System.out.println("7. Sair");	
		
		return new Scanner(System.in).nextInt();
	}


}
