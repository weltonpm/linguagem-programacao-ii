package welton.java.tela;

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
	private int telefone;
	private int fax;
	private int celular;
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
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
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
