package welton.java.tela;
import java.util.*;
public class AlteracaoClientes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<ITipoClienteModel> listTipoCliente = new ArrayList<ITipoClienteModel>();
		String opc;
		do{ //Leitura dos tipos de clientes
			ITipoClienteModel objTipoCliente = new TipoClienteModel();
			System.out.println("Entre com o id:");
			objTipoCliente.setId(sc.nextInt());
			System.out.println("Entre com o tipo de pessoa: ");
			String aux = sc.next();
			if(aux.equalsIgnoreCase("Fisica")){
				objTipoCliente.setFisica(true);
			}
			else{
				objTipoCliente.setJuridica(true);
			}
			listTipoCliente.add(objTipoCliente);
			System.out.println("Digite S para sair ou C para continuar lendo: ");
			opc = sc.next();
		}while(!opc.equalsIgnoreCase("S"));
		
		List<ISituacaoClienteModel> listSituacaoCliente = new ArrayList<ISituacaoClienteModel>();
		do{ //Leitura situacao do cliente
			ISituacaoClienteModel objSituacaoCliente = new SituacaoClienteModel();
			System.out.println("Entre com o id:");
			objSituacaoCliente.setId(sc.nextInt());
			System.out.println("Entre com o tipo de situacao: ");
			String aux = sc.next();
			if(aux.equalsIgnoreCase("Ativo")){
				objSituacaoCliente.setAtivo(true);
			}
			else{
				objSituacaoCliente.setInativo(true);
			}
			listSituacaoCliente.add(objSituacaoCliente);
			System.out.println("Digite S para sair ou C para continuar lendo: ");
			opc = sc.next();
		}while(!opc.equalsIgnoreCase("S"));
		
		List<ITipoCreditoModel> listTipoCredito = new ArrayList<ITipoCreditoModel>();
		do{ //Leitura dos tipos de creditos
			ITipoCreditoModel objTipoCredito = new TipoCreditoModel();
			System.out.println("Entre com o id:");
			objTipoCredito.setId(sc.nextInt());
			sc.nextLine();
			System.out.println("Entre com o tipo de credito: ");
			String aux = sc.nextLine();
			if(aux.equalsIgnoreCase("Livre")){
				objTipoCredito.setLivre(true);
			}
			else{
				if(aux.equalsIgnoreCase("Controle de Saldo")){
					objTipoCredito.setControleSaldo(true);
				}
				else{
					if(aux.equalsIgnoreCase("Cheque")){
						objTipoCredito.setCheque(true);
					}
					else{
						objTipoCredito.setSomenteAVista(true);
					}
				}
			}
			listTipoCredito.add(objTipoCredito);
			System.out.println("Digite S para sair ou C para continuar lendo: ");
			opc = sc.next();
		}while(!opc.equalsIgnoreCase("S"));
		
		List<IGerarRelSpedModel> listGerarRel = new ArrayList<IGerarRelSpedModel>();
		do{ //Leitura Gerar Rel Sped
			IGerarRelSpedModel objGerarRel = new GerarRelSpedModel();
			System.out.println("Entre com o id:");
			objGerarRel.setId(sc.nextInt());
			System.out.println("Entre com opcao Sim ou Nao: ");
			String aux = sc.next();
			if(aux.equalsIgnoreCase("Sim")){
				objGerarRel.setSim(true);
			}
			else{
				objGerarRel.setNao(true);
			}
			listGerarRel.add(objGerarRel);
			System.out.println("Digite S para sair ou C para continuar lendo: ");
			opc = sc.next();
		}while(!opc.equalsIgnoreCase("S"));
		
		List<IUfModel> listUf = new ArrayList<IUfModel>();
		do{ //Leitura comboBox UF
			IUfModel objUf = new UfModel();
			System.out.println("Entre com o id:");
			objUf.setId(sc.nextInt());
			System.out.println("Entre com o estado: ");
			objUf.setEstado(sc.next());
			listUf.add(objUf);
			System.out.println("Digite S para sair ou C para continuar lendo: ");
			opc = sc.next();
		}while(!opc.equalsIgnoreCase("S"));
		
		ICadastroBasicoModel cadastro = new CadastroBasico();
		System.out.println("Entre com o codigo:");
		cadastro.setCodigo(sc.nextInt());
		sc.nextLine();
		System.out.println("Entre com o nome do cliente:");
		cadastro.setNomeCliente(sc.nextLine());
		System.out.println("Entre com a matricula:");
		cadastro.setMatricula(sc.nextInt());
		sc.nextLine();
		System.out.println("Entre com o endereco:");
		cadastro.setEndereco(sc.nextLine());
		System.out.println("Entre com o numero:");
		cadastro.setNumero(sc.nextInt());
		sc.nextLine();
		System.out.println("Entre com o bairro:");
		cadastro.setBairro(sc.nextLine());
		System.out.println("Entre com a cidade:");
		cadastro.setCidade(sc.nextLine());
		for(IUfModel list: listUf){
			System.out.println("ID: "+list.getId()+" - UF: "+list.getEstado());
		}
		System.out.println("Digite o id da uf desejada: ");
		int auxId = sc.nextInt();
		for(int i=0;i<listUf.size();i++){
			if(auxId == listUf.get(i).getId()){
				cadastro.setUf(listUf.get(i));
			}
		}
		System.out.println("Entre com o ICMS:");
		cadastro.setIcms(sc.nextDouble());
		System.out.println("Entre com o CEP:");
		cadastro.setCep(sc.next());
		System.out.println("Entre com o telefone:");
		cadastro.setTelefone(sc.nextInt());
		System.out.println("Entre com o fax:");
		cadastro.setFax(sc.nextInt());
		System.out.println("Entre com o celular:");
		cadastro.setCelular(sc.nextInt());
		System.out.println("Entre com o e-mail:");
		cadastro.setEmail(sc.next());
		System.out.println("Entre com o codigo VIP - SEFAZ:");
		cadastro.setCodigoVipSefaz(sc.nextInt());
		System.out.println("Entre com o CPF:");
		cadastro.setCpf(sc.next());
		System.out.println("Entre com a carteira de identidade:");
		cadastro.setRg(sc.next());
		sc.nextLine();
		System.out.println("Entre com a data de emissao e orgao emissor:");
		cadastro.setDataEmissaoOrgaoEmissor(sc.nextLine());
		System.out.println("Entre com o CNPJ:");
		cadastro.setCnpj(sc.next());
		System.out.println("Entre com a insc. estadual:");
		cadastro.setInscEstadual(sc.next());
		System.out.println("Entre com o limite de credito:");
		cadastro.setLimiteCredito(sc.nextDouble());
		System.out.println("Entre com o saldo disponivel:");
		cadastro.setSaldoDisponivel(sc.nextDouble());
		System.out.println("Entre com a quantidade dup abertas no CR: ");
		cadastro.setQtdDupAbertas(sc.nextInt());
		sc.nextLine();
		System.out.println("Entre com as observacoes: ");
		cadastro.setObservacoes(sc.nextLine());
		System.out.println("Entre com a data/hora cadastro:");
		cadastro.setDataHoraCadastro(sc.nextLine());
		System.out.println("Entre com o usuario cadastro:");
		cadastro.setUsuarioCadastrado(sc.nextInt());
		sc.nextLine();
		System.out.println("Entre com o data/hora alteracao:");
		cadastro.setDataHoraAlteracao(sc.nextLine());
		System.out.println("Entre com o usuario alteracao:");
		cadastro.setUsuarioAlteracao(sc.nextInt());
		for(int i=0; i<listTipoCliente.size();i++){
			String s = "ID: "+listTipoCliente.get(i).getId();
			if(listTipoCliente.get(i).isFisica()){
				s += " - Tipo Pessoa: Fisica";
			}
			else{
				s += " - Tipo Pessoa: Juridica";
			}
			System.out.println(s);
		}
		System.out.println("Selecione o id do tipo de pessoa desejado: ");
		auxId = sc.nextInt();
		for(int i=0; i<listTipoCliente.size();i++){
			if(auxId == listTipoCliente.get(i).getId()){
				cadastro.setTipoCliente(listTipoCliente.get(i));
			}
		}
		for(int i=0; i<listSituacaoCliente.size();i++){
			String s = "ID: "+listSituacaoCliente.get(i).getId();
			if(listSituacaoCliente.get(i).isAtivo()){
				s += " - Situacao Cliente: Ativo";
			}
			else{
				s += " - Situacao Cliente: Inativo";
			}
			System.out.println(s);
		}
		System.out.println("Selecione o id da situacao desejada: ");
		auxId = sc.nextInt();
		for(int i=0; i<listSituacaoCliente.size();i++){
			if(auxId == listSituacaoCliente.get(i).getId()){
				cadastro.setSituacaoCliente(listSituacaoCliente.get(i));
			}
		}
		for(int i=0; i<listTipoCredito.size();i++){
			String s = "ID: "+listTipoCredito.get(i).getId();
			if(listTipoCredito.get(i).isLivre()){
				s += " - Tipo Credito: Livre";
			}
			else{
				if(listTipoCredito.get(i).isControleSaldo()){
					s += " - Tipo Credito: Controle de Saldo";
				}
				else{
					if(listTipoCredito.get(i).isCheque()){
						s += " - Tipo Credito: Cheque";
					}
					else{
						s += " - Tipo Credito: Somente a Vista";
					}
				}
			}
			System.out.println(s);
		}
		System.out.println("Selecione o id do tipo de credito desejado: ");
		auxId = sc.nextInt();
		for(int i=0; i<listTipoCredito.size();i++){
			if(auxId == listTipoCredito.get(i).getId()){
				cadastro.setTipoCredito(listTipoCredito.get(i));
			}
		}
		for(int i=0; i<listGerarRel.size();i++){
			String s = "ID: "+listGerarRel.get(i).getId();
			if(listGerarRel.get(i).isSim()){
				s += " - Gerar Rel SPED: Sim";
			}
			else{
				s += " - Gerar Rel SPED: Nao";
			}
			System.out.println(s);
		}
		System.out.println("Selecione o id da opcao desejada: ");
		auxId = sc.nextInt();
		for(int i=0; i<listGerarRel.size();i++){
			if(auxId == listGerarRel.get(i).getId()){
				cadastro.setGerarRelSped(listGerarRel.get(i));
			}
		}
		
		System.out.println("Codigo: "+cadastro.getCodigo()+" - Nome do Cliente: "+cadastro.getNomeCliente()+" - Matricula: "+cadastro.getMatricula()
		+"\nEndereco: "+cadastro.getEndereco()+" - Numero: "+cadastro.getNumero()+" - Bairro: "+cadastro.getBairro()+ " - Tipo Cliente: "+imprimeTipoCliente(cadastro.getTipoCliente())
		+"\nCidade: "+cadastro.getCidade()+" - UF: "+cadastro.getUf().getEstado()+" - ICMS: "+cadastro.getIcms()+" - CEP: "+cadastro.getCep()
		+" - Situacao do Cliente: "+imprimeSituacao(cadastro.getSituacaoCliente())+"\nTelefone: "+cadastro.getTelefone()+" - Fax: "+cadastro.getFax()
		+" - Celular: "+cadastro.getCelular()+"\ne-mail: "+cadastro.getEmail()+" - Codigo VIP - SEFAZ: "+cadastro.getCodigoVipSefaz()+"\nCIC/CPF: "
		+cadastro.getCpf()+" - Cart. Identidade: "+cadastro.getRg()+" - Data Emissao e Orgao Emissor: "+cadastro.getDataEmissaoOrgaoEmissor()
		+" - Tipo Credito: "+imprimeCredito(cadastro.getTipoCredito())+"\nCNPJ: "+cadastro.getCnpj()+" - Insc. Estadual: "+cadastro.getInscEstadual()
		+" - Limite de Credito R$: "+cadastro.getLimiteCredito()+" - Saldo Disponivel R$: "+cadastro.getSaldoDisponivel()+" - Qtde Dup Abertas no CR: "
		+cadastro.getQtdDupAbertas()+"\nObservacoes: "+cadastro.getObservacoes()+" - Data/Hora Cadastro: "+cadastro.getDataHoraCadastro()+
		" - Usuario Cadastro: "+cadastro.getUsuarioCadastrado()+"\nData/Hora Alteracao: "+cadastro.getDataHoraAlteracao()+ " - Usuario Alteracao: "
		+cadastro.getUsuarioAlteracao()+"\nGerar Rel SPED: "+imprimeRel(cadastro.getGerarRelSped()));
	}
	
	public static String imprimeTipoCliente(ITipoClienteModel tipoCliente){
		if(tipoCliente.isFisica()){
			return "Fisica";
		}
		else {
			return "Juridica";
		}
	}
	
	public static String imprimeSituacao(ISituacaoClienteModel situacaoCliente){
		if(situacaoCliente.isAtivo()){
			return "Ativo";
		}
		else {
			return "Inativo";
		}
	}
	
	public static String imprimeCredito(ITipoCreditoModel tipoCredito){
		if(tipoCredito.isLivre()){
			return "Livre";
		}
		else{
			if(tipoCredito.isControleSaldo()){
				return "Controle de Saldo";
			}
			else{
				if(tipoCredito.isCheque()){
					return "Cheque";
				}
				else{
					return "Somente a Vista";
				}
			}
		}
	}
	
	public static String imprimeRel(IGerarRelSpedModel gerarRel){
		if(gerarRel.isSim()){
			return "Sim";
		}
		else{
			return "Nao";
		}
	}
}
