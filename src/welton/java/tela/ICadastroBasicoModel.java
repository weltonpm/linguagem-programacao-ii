package welton.java.tela;

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
