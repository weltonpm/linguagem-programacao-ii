package welton.java.tela;

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
