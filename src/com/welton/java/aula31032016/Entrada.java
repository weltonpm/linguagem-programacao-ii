package com.welton.java.aula31032016;

import java.util.*;

public class Entrada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<IMoedaModel> listMoeda;
		listMoeda = new ArrayList<IMoedaModel>();
		INotaModel nota = new NotaModel();
		
		String opc;
		do{
			IMoedaModel moeda = new MoedaModel();
			System.out.println("Entre com o id da moeda: ");
			moeda.setId(scan.nextInt());
			System.out.println("Entre com o tipo da moeda: ");
			moeda.setMoeda(scan.next());
			listMoeda.add(moeda);
			System.out.println("Digite C para continuar ou S para sair:");
			opc = scan.next();
		}while(!opc.equalsIgnoreCase("S"));
		
		
		System.out.println("Entre com o id da nota: ");
		nota.setId(scan.nextInt());
		System.out.println("Entre com o número da nota: ");
		nota.setNumNota(scan.nextInt());
		
		System.out.println("Moedas: ");
		for(int i=0; i<listMoeda.size(); i++){
			System.out.println("ID : "+listMoeda.get(i).getId()+" - Moeda: "+listMoeda.get(i).getMoeda());
		}
		
		System.out.println("Entre com o id da moeda desejada: ");
		int idMoeda = scan.nextInt();
		for(int i =0; i<listMoeda.size(); i++){
			if(idMoeda == listMoeda.get(i).getId()){
				nota.setMoeda(listMoeda.get(i));
			}
		}
		
		System.out.println(" ---Nota--- ");
		System.out.println("ID: "+nota.getId()+"\nNúmero: "+nota.getNumNota()+"\nMoeda: "+nota.getMoeda().getMoeda());
		
	}

}
