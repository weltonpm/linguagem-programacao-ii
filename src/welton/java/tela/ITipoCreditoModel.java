package welton.java.tela;

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
