package fila;

import model.Curso;

public class Fila {
	private NO inicio;
	
	public Fila(){
		inicio=null;
	}
	
	public void AdicionaFinal(Curso e){
		if (inicio==null){
			NO n=new NO(e);
			inicio=n;
		}
		else{
			NO aux=inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			NO n=new NO(e);
			aux.prox=n;
		}
	}
	
	public Curso removeInicio() {
		Curso c = null;
		if(inicio == null) {
			System.out.println("Lista vazia");
		} else if(inicio.prox == null) {
			c = inicio.dado;
			inicio = null;
		} else {
			c = inicio.dado;
			inicio = inicio.prox;
		}
		return c;
	}
	
	public String percorre(){
		NO aux=inicio;
		String r=" ";
		while(aux!=null){
			r=r+"\n"+aux.dado.getNome();
			aux=aux.prox;
		}
		return r;
	}

}
