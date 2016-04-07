package welton.java.tela;

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
