package com.welton.java.aula31032016;

public class NotaModel implements INotaModel{
	private int id;
	private int numNota;
	private IMoedaModel moeda;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getNumNota(){
		return numNota;
	}
	public void setNumNota(int numNota){
		this.numNota = numNota;
	}
	public IMoedaModel getMoeda(){
		return moeda;
	}
	public void setMoeda(IMoedaModel moeda){
		this.moeda = moeda;
	}
}
