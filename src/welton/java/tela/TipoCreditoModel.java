package welton.java.tela;

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
