package atividade_ed;
public class Fila{	
	private No inicio;
	private No fim;
	
	public Fila(){
		inicio = null;
		fim =null;
	}

	public boolean isEmpty(){
		return inicio==null?true:false;
	}

	public void enqueue(int i){
		No novo = new No(i);
		if(isEmpty())
			inicio = novo;
		else{
			fim.setProx(novo);
		}	
		fim = novo;	
	}
	
	public int dequeue(){
		if(isEmpty())
			return 0;
		else{
			int i = inicio.getInfo();
			inicio = inicio.getProx();
			return i;
		}
	}

	public void imprimeFila(){
		No  tmp = inicio;
		System.out.print("Fila: ");
		while(tmp!=null){
			System.out.print(tmp.getInfo()+" ");
			tmp = tmp.getProx();
		}
		System.out.println();
	}

	public void exercicio(){
		No temp = inicio;
		temp = temp.getProx().getProx();
		inicio.setProx(temp);
		fim.setInfo(3);
		fim.setProx(inicio);
		temp.setInfo(fim.getProx().getInfo());//6613
		//temp.getProx().getProx().setInfo(fim.getProx().getProx().getProx().getInfo());//6611
	}

	public No getFim(){
		return fim;
	}
	public No getInicio(){
		return inicio;
	}
}