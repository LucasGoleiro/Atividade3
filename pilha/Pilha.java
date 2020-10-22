package pilha;
import model.Curso;

public class Pilha {
	private NO inicio;

	public Pilha(){
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
	
	public Curso RemoveFinal(){
		Curso r=null;
		if (inicio==null){
			System.out.println("Lista Vázia");
		}
		else{
			if (inicio.prox==null){
				r=inicio.dado;
				inicio=null;
			}
			else{
				NO aux1=inicio;
				NO aux2=inicio;

				while(aux1.prox!=null){
					aux2=aux1;
					aux1=aux1.prox;
				}

				r=aux1.dado;
				aux2.prox=null;
			}
		}
		return r;
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
