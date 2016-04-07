public interface IUfModel {
	public int getId();
	void setId(int id);
	String getEstado();
	void setEstado(String estado);
}
//ComboBox UF
public class UfModel implements IUfModel{
	private int id;
	private String estado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}

public interface ITipoClienteModel {
	int getId();
	void setId(int id);
	boolean isFisica();
	void setFisica(boolean fisica);
	boolean isJuridica();
	void setJuridica(boolean juridica);
}
//Selecao tipo de cliente
public class TipoClienteModel implements ITipoClienteModel {
	private int id;
	private boolean fisica;
	private boolean juridica;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isFisica() {
		return fisica;
	}
	public void setFisica(boolean fisica) {
		this.fisica = fisica;
	}
	public boolean isJuridica() {
		return juridica;
	}
	public void setJuridica(boolean juridica) {
		this.juridica = juridica;
	}	
}

public interface ISituacaoClienteModel {
	int getId();
	void setId(int id);
	boolean isAtivo();
	void setAtivo(boolean ativo);
	boolean isInativo();
	void setInativo(boolean inativo);
}
//Selecao Situacao do cliente
public class SituacaoClienteModel implements ISituacaoClienteModel {
	private int id;
	private boolean ativo;
	private boolean inativo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public boolean isInativo() {
		return inativo;
	}
	public void setInativo(boolean inativo) {
		this.inativo = inativo;
	}
}

public interface ITipoCreditoModel {
	int getId();
	void setId(int id);
	boolean isLivre();
	void setLivre(boolean livre);
	boolean isControleSaldo();
	void setControleSaldo(boolean controleSaldo);
	boolean isCheque();
	void setCheque(boolean cheque);
	boolean isSomenteAVista();
	void setSomenteAVista(boolean somenteAVista);
}
//Selecao tipo de credito
public class TipoCreditoModel implements ITipoCreditoModel {
	private int id;
	private boolean livre;
	private boolean controleSaldo;
	private boolean cheque;
	private boolean somenteAVista;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isLivre() {
		return livre;
	}
	public void setLivre(boolean livre) {
		this.livre = livre;
	}
	public boolean isControleSaldo() {
		return controleSaldo;
	}
	public void setControleSaldo(boolean controleSaldo) {
		this.controleSaldo = controleSaldo;
	}
	public boolean isCheque() {
		return cheque;
	}
	public void setCheque(boolean cheque) {
		this.cheque = cheque;
	}
	public boolean isSomenteAVista() {
		return somenteAVista;
	}
	public void setSomenteAVista(boolean somenteAVista) {
		this.somenteAVista = somenteAVista;
	}
}

public interface IGerarRelSpedModel {
	int getId();
	void setId(int id);
	boolean isSim();
	void setSim(boolean sim);
	boolean isNao();
	void setNao(boolean nao);
}
//Selecao Gerar Rel SPED
public class GerarRelSpedModel implements IGerarRelSpedModel{
	private int id;
	private boolean sim;
	private boolean nao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isSim() {
		return sim;
	}
	public void setSim(boolean sim) {
		this.sim = sim;
	}
	public boolean isNao() {
		return nao;
	}
	public void setNao(boolean nao) {
		this.nao = nao;
	}
}

public interface ICadastroBasicoModel {
	int getCodigo();
	void setCodigo(int codigo);
	String getNomeCliente();
	void setNomeCliente(String nomeCliente);
	int getMatricula();
	void setMatricula(int matricula);
	String getEndereco();
	void setEndereco(String endereco);
	int getNumero();
	void setNumero(int numero);
	String getBairro();
	void setBairro(String bairro);
	ITipoClienteModel getTipoCliente();
	void setTipoCliente(ITipoClienteModel tipoCliente);
	String getCidade();
	void setCidade(String cidade);
	IUfModel getUf();
	void setUf(IUfModel uf);
	double getIcms();
	void setIcms(double icms);
	String getCep();
	void setCep(String cep);
	ISituacaoClienteModel getSituacaoCliente();
	void setSituacaoCliente(ISituacaoClienteModel situacaoCliente);
	String getTelefone();
	void setTelefone(String telefone);
	String getFax();
	void setFax(String fax);
	String getCelular();
	void setCelular(String celular);
	String getEmail();
	void setEmail(String email);
	int getCodigoVipSefaz();
	void setCodigoVipSefaz(int codigoVipSefaz);
	String getCpf();
	void setCpf(String cpf);
	String getRg();
	void setRg(String rg);
	String getDataEmissaoOrgaoEmissor();
	void setDataEmissaoOrgaoEmissor(String dataEmissaoOrgaoEmissor);
	ITipoCreditoModel getTipoCredito();
	void setTipoCredito(ITipoCreditoModel tipoCredito);
	String getCnpj();
	void setCnpj(String cnpj);
	String getInscEstadual();
	void setInscEstadual(String inscEstadual);
	double getLimiteCredito();
	void setLimiteCredito(double limiteCredito);
	double getSaldoDisponivel();
	void setSaldoDisponivel(double saldoDisponivel);
	int getQtdDupAbertas();
	void setQtdDupAbertas(int qtdDupAbertas);
	String getObservacoes();
	void setObservacoes(String observacoes);
	String getDataHoraCadastro();
	void setDataHoraCadastro(String dataHoraCadastro);
	int getUsuarioCadastrado();
	void setUsuarioCadastrado(int usuarioCadastrado);
	String getDataHoraAlteracao();
	void setDataHoraAlteracao(String dataHoraAlteracao);
	int getUsuarioAlteracao();
	void setUsuarioAlteracao(int usuarioAlteracao);
	IGerarRelSpedModel getGerarRelSped();
	void setGerarRelSped(IGerarRelSpedModel gerarRelSped);
}

public class CadastroBasico implements ICadastroBasicoModel{
	private int codigo;
	private String nomeCliente;
	private int matricula;
	private String endereco;
	private int numero;
	private String bairro;
	private ITipoClienteModel tipoCliente;
	private String cidade;
	private IUfModel uf;
	private double icms;
	private String cep;
	private ISituacaoClienteModel situacaoCliente;
	private String telefone;
	private String fax;
	private String celular;
	private String email;
	private int codigoVipSefaz;
	private String cpf;
	private String rg;
	private String dataEmissaoOrgaoEmissor;
	private ITipoCreditoModel tipoCredito;
	private String cnpj;
	private String inscEstadual;
	private double limiteCredito;
	private double saldoDisponivel;
	private int qtdDupAbertas;
	private String observacoes;
	private String dataHoraCadastro;
	private int usuarioCadastrado;
	private String dataHoraAlteracao;
	private int usuarioAlteracao;
	private IGerarRelSpedModel gerarRelSped;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public ITipoClienteModel getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(ITipoClienteModel tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public IUfModel getUf() {
		return uf;
	}
	public void setUf(IUfModel uf) {
		this.uf = uf;
	}
	public double getIcms() {
		return icms;
	}
	public void setIcms(double icms) {
		this.icms = icms;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public ISituacaoClienteModel getSituacaoCliente() {
		return situacaoCliente;
	}
	public void setSituacaoCliente(ISituacaoClienteModel situacaoCliente) {
		this.situacaoCliente = situacaoCliente;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCodigoVipSefaz() {
		return codigoVipSefaz;
	}
	public void setCodigoVipSefaz(int codigoVipSefaz) {
		this.codigoVipSefaz = codigoVipSefaz;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataEmissaoOrgaoEmissor() {
		return dataEmissaoOrgaoEmissor;
	}
	public void setDataEmissaoOrgaoEmissor(String dataEmissaoOrgaoEmissor) {
		this.dataEmissaoOrgaoEmissor = dataEmissaoOrgaoEmissor;
	}
	public ITipoCreditoModel getTipoCredito() {
		return tipoCredito;
	}
	public void setTipoCredito(ITipoCreditoModel tipoCredito) {
		this.tipoCredito = tipoCredito;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscEstadual() {
		return inscEstadual;
	}
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}
	public int getQtdDupAbertas() {
		return qtdDupAbertas;
	}
	public void setQtdDupAbertas(int qtdDupAbertas) {
		this.qtdDupAbertas = qtdDupAbertas;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public String getDataHoraCadastro() {
		return dataHoraCadastro;
	}
	public void setDataHoraCadastro(String dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}
	public int getUsuarioCadastrado() {
		return usuarioCadastrado;
	}
	public void setUsuarioCadastrado(int usuarioCadastrado) {
		this.usuarioCadastrado = usuarioCadastrado;
	}
	public String getDataHoraAlteracao() {
		return dataHoraAlteracao;
	}
	public void setDataHoraAlteracao(String dataHoraAlteracao) {
		this.dataHoraAlteracao = dataHoraAlteracao;
	}
	public int getUsuarioAlteracao() {
		return usuarioAlteracao;
	}
	public void setUsuarioAlteracao(int usuarioAlteracao) {
		this.usuarioAlteracao = usuarioAlteracao;
	}
	public IGerarRelSpedModel getGerarRelSped() {
		return gerarRelSped;
	}
	public void setGerarRelSped(IGerarRelSpedModel gerarRelSped) {
		this.gerarRelSped = gerarRelSped;
	}	
}

//main
import java.util.*;
public class AlteracaoClientes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<ITipoClienteModel> listTipoCliente = new ArrayList<ITipoClienteModel>();
		String opc;
		System.out.println("Leitura do tipos de clientes para o campo tipo cliente");
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
		System.out.println("Leitura de situacoes para o campo situacao cliente");
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
		System.out.println("Leitura de creditos para o campo tipo de credito");
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
		System.out.println("Leitura de informacao para o campo GerarRelSped");
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
		System.out.println("Leitura de UFS para o campo UF");
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
		
		//Leitura dos dados
		System.out.println("Leitura e seleção dos dados");
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
		for(IUfModel list: listUf){ //Leitura UF
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
		cadastro.setTelefone(sc.next());
		System.out.println("Entre com o fax:");
		cadastro.setFax(sc.next());
		System.out.println("Entre com o celular:");
		cadastro.setCelular(sc.next());
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
		for(int i=0; i<listTipoCliente.size();i++){ //Selecao tipo de cliente
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
		for(int i=0; i<listSituacaoCliente.size();i++){ //Selecao situacao do cliente
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
		for(int i=0; i<listTipoCredito.size();i++){ //Selecao tipo de credito
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
		for(int i=0; i<listGerarRel.size();i++){ //Selecao Gerar Rel
			if(auxId == listGerarRel.get(i).getId()){
				cadastro.setGerarRelSped(listGerarRel.get(i));
			}
		}
		//Saida 
		System.out.println("Codigo: "+cadastro.getCodigo()+" - Nome do Cliente: "
		+cadastro.getNomeCliente()+" - Matricula: "+cadastro.getMatricula()
		+"\nEndereco: "+cadastro.getEndereco()+" - Numero: "+cadastro.getNumero()
		+" - Bairro: "+cadastro.getBairro()+ " - Tipo Cliente: "
		+imprimeTipoCliente(cadastro.getTipoCliente())+"\nCidade: "
		+cadastro.getCidade()+" - UF: "+cadastro.getUf().getEstado()+" - ICMS: "
		+cadastro.getIcms()+" - CEP: "+cadastro.getCep()+" - Situacao do Cliente: "
		+imprimeSituacao(cadastro.getSituacaoCliente())+"\nTelefone: "
		+cadastro.getTelefone()+" - Fax: "+cadastro.getFax()+" - Celular: "
		+cadastro.getCelular()+"\ne-mail: "+cadastro.getEmail()
		+" - Codigo VIP - SEFAZ: "+cadastro.getCodigoVipSefaz()+"\nCIC/CPF: "
		+cadastro.getCpf()+" - Cart. Identidade: "+cadastro.getRg()
		+" - Data Emissao e Orgao Emissor: "+cadastro.getDataEmissaoOrgaoEmissor()
		+" - Tipo Credito: "+imprimeCredito(cadastro.getTipoCredito())+"\nCNPJ: "
		+cadastro.getCnpj()+" - Insc. Estadual: "+cadastro.getInscEstadual()+
		" - Limite de Credito R$: "+cadastro.getLimiteCredito()
		+" - Saldo Disponivel R$: "+cadastro.getSaldoDisponivel()+
		" - Qtde Dup Abertas no CR: "+cadastro.getQtdDupAbertas()+"\nObservacoes: "
		+cadastro.getObservacoes()+" - Data/Hora Cadastro: "
		+cadastro.getDataHoraCadastro()+" - Usuario Cadastro: "
		+cadastro.getUsuarioCadastrado()+"\nData/Hora Alteracao: "
		+cadastro.getDataHoraAlteracao()+ " - Usuario Alteracao: "
		+cadastro.getUsuarioAlteracao()+"\nGerar Rel SPED: "
		+imprimeRel(cadastro.getGerarRelSped()));
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
